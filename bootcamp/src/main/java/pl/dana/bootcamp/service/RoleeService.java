package pl.dana.bootcamp.service;


import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import pl.dana.bootcamp.model.Rolee;
import pl.dana.bootcamp.repository.RoleeRepository;

@Service
@AllArgsConstructor
public class RoleeService {
	
	private final RoleeRepository roleeRepository;
	
	public Rolee findByName(String roleeName) {
		return roleeRepository.findByRoleeName(roleeName);
	}

}
