package com.birdsnail.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author BirdSnail
 * @date 2020/8/28
 */
@Controller
@RequestMapping("/test/user")
public class UserTestController {

	@GetMapping
	public String user() {
		return "user info is null";
	}
}
