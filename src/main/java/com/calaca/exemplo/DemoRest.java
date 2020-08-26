package com.calaca.exemplo;

import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoRest {

	@GetMapping
	public String get() {
		return "OK";
	}
	
	@PostMapping
	public String post(@RequestBody Map<String, Object> dados) {
		return "Ok, do POST " + dados.get("nome");
	}
	
	@PutMapping
	public void put() {
		System.out.println("Put");
	}
	
	@DeleteMapping
	public void delete() {
		System.out.println("DELETE");
	}
}
