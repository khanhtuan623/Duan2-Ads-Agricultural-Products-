package tdt.duan2.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tdt.duan2.model.Profile;
import tdt.duan2.services.UserSerivesInterface;

@RestController
public class APIController {

	@Autowired
	private UserSerivesInterface userSerivesInterface;
	
	@GetMapping("/api")
	public String home() {
		return "ok";
	}
	
	@PostMapping("/new")
	public Object test(@RequestBody Profile profile) throws ParseException {
		return userSerivesInterface.updateUser(profile);
	}
	
}
