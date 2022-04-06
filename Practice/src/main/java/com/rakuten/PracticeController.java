package com.rakuten;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/practice")
public class PracticeController {
	List<Practice>practices=new ArrayList<>();
	
	@PostMapping
	void savePractice(@RequestBody Practice practice) {
		System.out.println(practice.getName());
		System.out.println(practice.getAge());
		practices.add(practice);
		
	}
	
	@GetMapping
	List<Practice> getPractice(){
		return practices;
	}
	

}
