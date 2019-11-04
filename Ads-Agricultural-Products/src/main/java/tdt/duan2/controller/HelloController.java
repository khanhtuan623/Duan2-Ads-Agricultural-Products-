package tdt.duan2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping(value = { "/", "/index" })
	public String index(Model model) {
		String message="Successfull!";
		model.addAttribute("message", message);
		return ("home");
	}
	
	@RequestMapping(value="/test")
	public String test() {
		return "home";
	}
}