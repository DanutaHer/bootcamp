package pl.dana.bootcamp.controllers;

import java.util.Arrays;

import org.springframework.boot.Banner.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pl.dana.bootcamp.enums.Cities;
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
		model.addAttribute("cities", Arrays.asList(Cities.values()));
		model.addAttribute("modeList", Arrays.asList(Mode.values()));
		model.addAttribute("course", Course.builder().build());
		return "course/addCourse";
	}

	@PostMapping("/dodaj")
	public String createCourse(@ModelAttribute Course course, Model model) {
		model.addAttribute("cities", Arrays.asList(Cities.values()));
		model.addAttribute("modeList", Arrays.asList(Mode.values()));
		model.addAttribute("course", Course.builder().build());
		model.addAttribute("createdCourse", course);
		return "course/addCourse";
	}
}
