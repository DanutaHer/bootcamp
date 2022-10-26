package pl.dana.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.dana.bootcamp.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
