package pl.dana.bootcamp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.AllArgsConstructor;
import pl.dana.bootcamp.enums.Cities;
import pl.dana.bootcamp.enums.TypMod;
import pl.dana.bootcamp.model.Course;
import pl.dana.bootcamp.service.CourseService;
import pl.dana.bootcamp.service.EmployeesService;

@Controller
@AllArgsConstructor
@RequestMapping(value = "/kurs")
public class CourseController {
	
	private final CourseService courseService;
	private final EmployeesService employeesService;

	@GetMapping("")
	public String course() {
		return "course/course";
	}

	@GetMapping("/lista")
	public String courseList(@RequestParam(name = "idKursu", required = false) String id, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("courseList", courseService.findAll());
		return "course/courseList";
	}

	@GetMapping("/dodaj")
	public String addCourse(Model model) {
		model.addAttribute("cities", Cities.values());
		model.addAttribute("modes", TypMod.values());
		model.addAttribute("course", Course.builder().build());
		model.addAttribute("teacherList", employeesService.findEmployeesByRoleName("teacher"));
		return "course/addCourse";
	}

	@PostMapping("/kursDodany")
	public String createCourse(@ModelAttribute Course course, Model model) {
		model.addAttribute("cities", Cities.values());
		model.addAttribute("modes", TypMod.values());
		model.addAttribute("course", Course.builder().build());
		model.addAttribute("createdCourse", course);
		courseService.save(course);
		return "course/created";
	}
}
