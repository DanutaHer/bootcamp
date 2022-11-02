package pl.dana.bootcamp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import pl.dana.bootcamp.model.Employees;
import pl.dana.bootcamp.repository.EmployeesRepository;

@Service
@AllArgsConstructor
public class EmployeesService {

	private final EmployeesRepository employeesRepository;

	public void save(final Employees employee) {
		employeesRepository.save(employee);
	}
	
	public List<Employees> findAll(){
		return employeesRepository.findAll();
	}
}
