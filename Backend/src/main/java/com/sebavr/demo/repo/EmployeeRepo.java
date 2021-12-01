package com.sebavr.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sebavr.demo.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

	void deleteEmployeeById(Long id);

	Optional<Employee> findEmployeeById(Long id);

}
