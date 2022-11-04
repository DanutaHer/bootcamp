package pl.dana.bootcamp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.dana.bootcamp.model.Employees;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Long> {
	List<Employees> findByRolee_RoleeNameContains(String roleeName);

}
