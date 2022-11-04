package pl.dana.bootcamp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import pl.dana.bootcamp.service.EmployeesService;
import pl.dana.bootcamp.service.StudentService;

@Controller
@AllArgsConstructor
@RequestMapping(value = "/admin")
public class AdminController {
	private final EmployeesService employeesService;
	private final StudentService studentService;
	
	@GetMapping("/listaPracownikow")
	public String employeesList(Model model) {
		model.addAttribute("employeesList", employeesService.findAll());
		return "employees/employeesList";
	}
	
	@GetMapping("/listaStudentow")
	public String studentsList(Model model) {
		model.addAttribute("studentsList", studentService.findAll());
		return "student/studentsList";
	}
	
	@GetMapping("/deletePr/{id}")
	public String employeesDelete(@PathVariable ("id") Long id) {
		employeesService.delete(id);
		return "redirect: admin/listaPracownikow";
	}
	
	@GetMapping("/deleteSu/{id}")
	public String studentDelete(@PathVariable ("id") Long id) {
		studentService.delete(id);
		return "redirect: admin/listaStudentow";
	}
	
}
