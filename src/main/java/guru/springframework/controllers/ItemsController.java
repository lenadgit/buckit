package guru.springframework.controllers;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import guru.springframework.domain.Category;
import guru.springframework.domain.ItemForView;
import guru.springframework.repositories.ItemRepository;
import guru.springframework.repositories.UserRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class ItemsController {

	private final UserRepository userRepository;
	private final ItemRepository itemRepository;

	@GetMapping("user/{id}/items")
	public String showById(@PathVariable Long id, Model model){

		List<Category> categories = userRepository.findById(id).get().getCategories();
		model.addAttribute("categories", categories);
		model.addAttribute("products", StreamSupport.stream(itemRepository.findAll().spliterator(), false)
				.filter(item -> categories.contains(item.getCategory()))
				.map(item -> new ItemForView(item.getName(), item.getCategory().getDescription(), item.getIcon()))
		.collect(Collectors.toList()));

		return "items";
	}

}
