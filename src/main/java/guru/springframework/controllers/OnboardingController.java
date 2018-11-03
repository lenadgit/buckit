package guru.springframework.controllers;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import guru.springframework.domain.Item;
import guru.springframework.repositories.ItemRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class OnboardingController {

	private final ItemRepository itemRepository;

	@GetMapping({"", "/", "/index"})
	public String showIndex() {
		return "index";
	}

	@GetMapping({"/welcome"})
	public String showWelcome() {
		return "welcome";
	}

	@GetMapping("/challenge")
	public String showChallenge(Model model) {

		List<Item> items = StreamSupport.stream(itemRepository.findAll().spliterator(), false)
				.filter(item -> item.getCategory().getDescription().equals("Fun&Simple"))
				.collect(Collectors.toList());
		Item item = items.get(new Random().nextInt(items.size()));

		model.addAttribute("item", item);

		return "challenge";
	}

	@GetMapping("/congratulations")
	public String showCongratulations() {
		return "congratulations";
	}
}
