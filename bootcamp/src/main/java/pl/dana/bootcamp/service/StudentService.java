package pl.dana.bootcamp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import pl.dana.bootcamp.model.Student;
import pl.dana.bootcamp.repository.StudentRepository;

@Service
@AllArgsConstructor
public class StudentService {
	
	private final StudentRepository studentRepository;
	
	public void save(Student student) {
		studentRepository.save(student);
		
	}
	
	public List<Student> findAll(){
		return studentRepository.findAll();
	}
	
	public void delete(Student student) {
		studentRepository.delete(student);
	}
	

}
