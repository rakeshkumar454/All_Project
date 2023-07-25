package com.globallogic.OneToOneMapping.repo;

import com.globallogic.OneToOneMapping.modal.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
