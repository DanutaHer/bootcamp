package pl.dana.bootcamp.controllers;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pl.dana.bootcamp.enums.Cities;
import pl.dana.bootcamp.enums.TypMod;
import pl.dana.bootcamp.model.Course;
import pl.dana.bootcamp.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@GetMapping("/dodawanie")
	public String addStudent(Model model) {
		model.addAttribute("cities", Cities.values());
		model.addAttribute("modes", TypMod.values());
		List<Course> listCourses = new LinkedList<>();
		listCourses.add(Course.builder().id(1L).name("Java").typmod(TypMod.DAILY).cities(Cities.GDANSK).build());
		listCourses.add(Course.builder().id(2L).name("Phyton").typmod(TypMod.EVENING).cities(Cities.GDANSK).build());
		listCourses.add(Course.builder().id(3L).name("HTML").typmod(TypMod.WEEKEND).cities(Cities.GDANSK).build());
		model.addAttribute("coursesList", listCourses);
		model.addAttribute("student", Student.builder().build());
		return "student/addStudent";
	}

	@PostMapping("/studentDodany")
	public String createStudent(@ModelAttribute Student student, @RequestParam Long[] coursesId, Model model) {
		model.addAttribute("cities", Cities.values());
		model.addAttribute("modes", TypMod.values());
		model.addAttribute("student", Student.builder().build());
		model.addAttribute("createdStudent", student);
		return "student/addedStudent";
	}
}
