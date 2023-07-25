package com.globallogic.OneToOneMapping.repo;

import com.globallogic.OneToOneMapping.modal.Course;
import com.globallogic.OneToOneMapping.modal.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Integer> {

    List<Course> findByStudent(Student student);
}
