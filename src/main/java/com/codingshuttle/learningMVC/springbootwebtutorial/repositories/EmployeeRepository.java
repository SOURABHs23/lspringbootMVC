package com.codingshuttle.learningMVC.springbootwebtutorial.repositories;

import com.codingshuttle.learningMVC.springbootwebtutorial.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

}
