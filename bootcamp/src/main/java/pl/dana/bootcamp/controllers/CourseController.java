package pl.dana.bootcamp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pl.dana.bootcamp.enums.Cities;
import pl.dana.bootcamp.enums.Mode;
import pl.dana.bootcamp.model.Course;
import pl.dana.bootcamp.model.Student;

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
		model.addAttribute("cities", Cities.values());
		model.addAttribute("course", Course.builder().build());
		return "course/addCourse";
	}

	@PostMapping("/dodaj")
	public String createCourse(@ModelAttribute Course course, Model model) {
		model.addAttribute("cities", Cities.values());
		model.addAttribute("course", Course.builder().build());
		model.addAttribute("createdCourse", course);
		return "course/addCourse";
	}

	@GetMapping("/student")
	public String addStudent(Model model) {
		model.addAttribute("cities", Cities.values());
		model.addAttribute("modes", Mode.values());
		model.addAttribute("student", Student.builder().build());
		return "course/addStudent";
	}

	@PostMapping("/studentDodany")
	public String createStudent(@ModelAttribute Student student, Model model) {
		model.addAttribute("cities", Cities.values());
		model.addAttribute("modes", Mode.values());
		model.addAttribute("student", Student.builder().build());
		model.addAttribute("createdStudent", student);
		return "course/addedStudent";
	}
}
