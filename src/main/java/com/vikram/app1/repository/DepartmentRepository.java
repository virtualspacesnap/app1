package com.vikram.app1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.vikram.app1.entity.Department;
 
// Annotation
@Repository
 
// Interface extending CrudRepository
public interface DepartmentRepository extends CrudRepository<Department, Long> {
}