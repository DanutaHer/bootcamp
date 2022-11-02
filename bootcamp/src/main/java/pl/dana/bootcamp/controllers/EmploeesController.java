package pl.dana.bootcamp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import pl.dana.bootcamp.model.Employees;
import pl.dana.bootcamp.service.EmployeesService;
import pl.dana.bootcamp.service.RoleeService;

@Controller
@AllArgsConstructor
@RequestMapping(value = "/pracownicy")
public class EmploeesController {
	
	private final EmployeesService employeesService;
	private final RoleeService roleeService;
	
	@GetMapping("/dodaj")
	public String addCourse(Model model) {
		model.addAttribute("employee", Employees.builder().build());
		return "employees/addemployee";
	}

	@PostMapping("/pracownikDodany")
	public String createCourse(@ModelAttribute Employees employee, Model model) {
		model.addAttribute("employee", Employees.builder().build());
		model.addAttribute("createdEmployee", employee);
		employee.setRolee(roleeService.findByName("teacher"));
		employeesService.save(employee);
		return "employees/addemployee";
	}

}
