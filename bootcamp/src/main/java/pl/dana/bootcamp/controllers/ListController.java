package pl.dana.bootcamp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/kurs/lista")
public class ListController {

	@GetMapping
	private String courseList() {
		return "courseList";
	}
}
