package com.globallogic.OneToOneMapping.repo;

import com.globallogic.OneToOneMapping.modal.FinalProject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<FinalProject, Integer> {
}
