package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@GetMapping("/")
	public ResponseEntity<String> root()
	{
		return ResponseEntity.ok("Rootooooo!");
	}
	@GetMapping("/dedo")
	public ResponseEntity<String> dedo()
	{
		return ResponseEntity.ok("Lele!");
	}
}
