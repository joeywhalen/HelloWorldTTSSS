package com.tts.helloWorldTTSSS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tts.helloWorldTTSSS.model.Greeting;

@Controller
public class GreetingController {

	// @RequestMapping(value = "/greeting", method = RequestMethod.GET)
	@GetMapping(value = "/greeting")
	public String greetingForm(Greeting greeting, Model model) {
		model.addAttribute("greeting", greeting);
		return "greeting";
	}
	
//	@GetMapping(value = "/greeting")
//	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
//			Model model) {
//		model.addAttribute("name", name);
//		return "greeting";
//	}

	@PostMapping("/greeting")
	public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
		model.addAttribute("greeting", greeting);
		return "result";
	}

	@GetMapping(value = "/")
	public String index() {
		return "index";
	}
}
