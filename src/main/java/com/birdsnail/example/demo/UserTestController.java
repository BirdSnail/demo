package com.birdsnail.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BirdSnail
 * @date 2020/8/28
 */
@RestController
@RequestMapping("/test/user")
public class UserTestController {

	@GetMapping
	public String user() {
		return "user info is null";
	}
}
