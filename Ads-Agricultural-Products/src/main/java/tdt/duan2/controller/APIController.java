package tdt.duan2.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tdt.duan2.entity.RoleEntity;
import tdt.duan2.services.AdminServices;

@RestController
public class APIController {

	@Autowired
	private AdminServices admin;
	
	@GetMapping("/api")
	public String home() {
		return "ok";
	}
	
	@PostMapping("/new")
	public RoleEntity test(@RequestBody RoleEntity role) throws ParseException {
		admin.addRole(role);
		return role;
	}
	
}
