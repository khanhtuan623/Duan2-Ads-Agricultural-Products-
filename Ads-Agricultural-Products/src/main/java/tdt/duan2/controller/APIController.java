package tdt.duan2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

	@GetMapping("/api")
	public String home() {
		return "ok";
	}
}
