package pl.dana.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.dana.bootcamp.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	

}
