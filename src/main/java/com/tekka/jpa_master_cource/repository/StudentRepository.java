package com.tekka.jpa_master_cource.repository;

import com.tekka.jpa_master_cource.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
}
