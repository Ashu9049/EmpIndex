package com.emp.index.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp.index.entities.Employee;

public interface EmpRepository extends JpaRepository<Employee, Long> {

}
