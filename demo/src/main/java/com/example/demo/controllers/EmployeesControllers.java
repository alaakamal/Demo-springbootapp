package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.Employees;
import com.example.demo.services.EmployeesService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "Employees")
@CrossOrigin(origins = "http://localhost:4200")
@EntityScan(basePackages = "com.example.demo.entities")
public class EmployeesControllers {
	@Autowired
	private EmployeesService employeeservice;

	public EmployeesControllers(EmployeesService employeeservice) {
		this.employeeservice = employeeservice;
	}

	@GetMapping
	public ResponseEntity<List<Employees>> getAllEmployees() {
		List<Employees> employees = employeeservice.findAllEmployees();
		return new ResponseEntity<>(employees, HttpStatus.OK);
	}

	/*
	 * @ResponseStatus(value = HttpStatus.OK) public List<Employees>
	 * getAllEmployees() { // List<Employees> employees =
	 * employeeservice.finAllEmployees(); return
	 * this.employeeservice.finAllEmployees(); }
	 */
	@GetMapping("/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public Optional<Employees> getEmployeeById(@PathVariable String id) {
		// Employees employees = employeeservice.findEmployeeById(id);
		return this.employeeservice.findEmployeeById(id);
	}

	@PostMapping("/add")
	public ResponseEntity<Employees> addEmployee(@RequestBody Employees employee) {
		Employees newEmployee = employeeservice.addEmployee(employee);
		return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public ResponseEntity<Employees> updateEmployee(@RequestBody Employees employee) {
		Employees updateEmployee = employeeservice.updateEmployees(employee);
		return new ResponseEntity<>(updateEmployee, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable String id) {
		employeeservice.deleteEmployee(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
