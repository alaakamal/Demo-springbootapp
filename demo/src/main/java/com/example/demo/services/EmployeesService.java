package com.example.demo.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Employees;
import com.example.demo.repositories.EmployeesRepository;

@Service
@EntityScan(basePackages = "com.example.demo.entities")
public class EmployeesService {
	private final EmployeesRepository employeesrepository;

	public EmployeesService(EmployeesRepository employeesrepository) {
		this.employeesrepository = employeesrepository;
	}

	public Employees addEmployee(Employees employee) {
		employee.setemployee_id(UUID.randomUUID().toString());
		return employeesrepository.save(employee);
	}

	public List<Employees> findAllEmployees() {
		return employeesrepository.findAll();
	}

	public Employees updateEmployees(Employees employee) {
		return employeesrepository.save(employee);
	}

	public void deleteEmployee(String id) {
		employeesrepository.deleteById(id);
	}

	public Optional<Employees> findEmployeeById(String id) {
		return employeesrepository.findById(id);
	}
}
