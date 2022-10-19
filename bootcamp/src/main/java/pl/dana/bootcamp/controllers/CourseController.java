package pl.dana.bootcamp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pl.dana.bootcamp.model.Course;

@Controller
@RequestMapping(value = "/kurs")
public class CourseController {

	@GetMapping("")
	public String course() {
		return "course/course";
	}
	
	@GetMapping("/lista")
	public String courseList(@RequestParam(name = "idKursu", required = false) String id, Model model) {
		model.addAttribute("id", id);
		
		return "course/courseList";
	}
	
	@GetMapping("/dodaj")
	public String addCourse(Model model) {
		String [] cities = new String []{"Warszawa", "Szczecin", "Gdańsk"};
		model.addAttribute("cities", cities);
		model.addAttribute("course", Course.builder().build());
		return "course/addcourse";
	}

	@PostMapping("/dodaj")
	public String create(@ModelAttribute Course course) {
		return "course/created";
	}
}
