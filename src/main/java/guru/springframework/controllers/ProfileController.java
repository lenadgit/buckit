package guru.springframework.controllers;

import guru.springframework.services.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import org.springframework.stereotype.Controller;

@Controller
@Log4j2
@RequiredArgsConstructor
public class ProfileController {
	private final UserService userService;

//	@GetMapping("/profile/{id}")
//	public String showById(@PathVariable String id, Model model){
//
//		model.addAttribute("user", userService.findById(new Long(id)));
//
//		return "profile";
//	}
//
//	@GetMapping("recipe/new")
//	public String newRecipe(Model model){
//		model.addAttribute("recipe", new RecipeCommand());
//
//		return "recipe/recipeform";
//	}
//
//	@GetMapping("recipe/{id}/update")
//	public String updateRecipe(@PathVariable String id, Model model){
//		model.addAttribute("recipe", userService.findCommandById(Long.valueOf(id)));
//		return  "recipe/recipeform";
//	}
//
//	@PostMapping("recipe")
//	public String saveOrUpdate(@ModelAttribute RecipeCommand command){
//		RecipeCommand savedCommand = userService.saveRecipeCommand(command);
//
//		return "redirect:/recipe/" + savedCommand.getId() + "/show";
//	}
//
//	@GetMapping("recipe/{id}/delete")
//	public String deleteById(@PathVariable String id){
//
//		log.debug("Deleting id: " + id);
//
//		userService.deleteById(Long.valueOf(id));
//		return "redirect:/";
//	}
}
