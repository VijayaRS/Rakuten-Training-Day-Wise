package com.rakuten;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService service;

	@PostMapping
	void saveUser(@RequestBody User user) {
		System.out.println(user.getName());
		System.out.println(user.getAge());

		service.save(user);
	}

	@GetMapping
	List<User> getUsers() {
		System.out.println("get method called");
		return service.getAllUsers();
	}

	@GetMapping("/{name}")
	List<User> getUsersByName(@PathVariable String name) {

		System.out.println("getuserbyname called");
		System.out.println(name);

		return service.getUserByName(name);
	}

	@GetMapping("/age/{age}")
	List<User> getUsersByAge(@PathVariable int age) {
//		if(age<=0) {
//			throw new 
//			IllegalArgumentException("age cannot be negative="+age);
//		}

		System.out.println("getuserbyageScalled");
		System.out.println(age);
		return service.getUserByAge(age);
	}

}
