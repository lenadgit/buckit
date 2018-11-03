package guru.springframework.controllers;

import guru.springframework.repositories.CategoryRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class CategoriesController {

	private final CategoryRepository categoryRepository;

	@GetMapping("/categories")
	public String showById(Model model){

		model.addAttribute("categories", categoryRepository.findAll());

		return "items";
	}
}
