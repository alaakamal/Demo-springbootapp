package com.example.demo.repositories;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Employees;

@Repository
@EntityScan(basePackages = "com.example.demo.entities")
public interface EmployeesRepository extends JpaRepository<Employees, String> {
}
