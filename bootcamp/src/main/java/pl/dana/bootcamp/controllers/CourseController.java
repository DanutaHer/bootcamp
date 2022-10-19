package pl.dana.bootcamp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/kurs")
public class CourseController {

	@GetMapping("")
	private String course() {
		return "course/course";
	}
	
	@GetMapping("/lista")
	private String courseList() {
		return "course/courseList";
	}

}
