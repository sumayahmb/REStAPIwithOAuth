package com.lendo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

	String userUrl = "https://gorest.co.in/public/v2/users";
	String token = "28d53b938a7bf46e79fedb4fa1fdbc740ae10b32bb5f2f0f89af725136ef045f";

	@GetMapping("/users")
	public List<Object> getUsers() throws Exception {
		RestTemplate restTemplate = new RestTemplate();
		Object[] list = restTemplate.getForObject(userUrl, Object[].class);
		return Arrays.asList(list);
	}
}
