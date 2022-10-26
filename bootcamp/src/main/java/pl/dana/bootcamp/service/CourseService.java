package pl.dana.bootcamp.service;


import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import pl.dana.bootcamp.model.Course;
import pl.dana.bootcamp.repository.CourseRepository;

@Service
@AllArgsConstructor
public class CourseService {
	
	private final CourseRepository courseRepository;

	public void save(Course course) {
		courseRepository.save(course);
	}
	
	public List<Course> findAll(){
		return courseRepository.findAll();
	}


}
