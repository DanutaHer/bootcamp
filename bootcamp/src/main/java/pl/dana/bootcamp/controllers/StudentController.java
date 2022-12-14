package pl.dana.bootcamp.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import pl.dana.bootcamp.model.Student;
import pl.dana.bootcamp.service.CourseService;
import pl.dana.bootcamp.service.RoleeService;
import pl.dana.bootcamp.service.StudentService;

@Controller
@AllArgsConstructor
@RequestMapping("/student")
public class StudentController {
	
	private final StudentService studentService;
	private final CourseService courseService;
	private final RoleeService roleeService;

	@GetMapping("/dodawanie")
	public String addStudent(Model model) {
		model.addAttribute("coursesList", courseService.findAll());
		model.addAttribute("student", Student.builder().build());
		return "student/addStudent";
	}

	@PostMapping("/studentDodany")
	public String createStudent(@ModelAttribute Student student, Model model) {
		model.addAttribute("student", Student.builder().build());
		model.addAttribute("createdStudent", student);
		student.setRolee(roleeService.findByName("user"));
		studentService.save(student);
		return "student/addedStudent";
	}	
	
}
