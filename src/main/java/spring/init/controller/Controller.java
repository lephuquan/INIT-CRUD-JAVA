package spring.init.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

	@GetMapping(value = {"/","home"})
	public String Home(Model model) {
		model.addAttribute("message", "hello");
		return "home";
	}
}
