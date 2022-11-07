package com.tekka.jpa_master_cource.repository;

import com.tekka.jpa_master_cource.model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long>{
}
