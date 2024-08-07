package com.example.demo.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import jakarta.persistence.*;

@EntityScan(basePackages = "com.example.demo.entities")
@Entity
@Table(name = "EMPLOYEES")
public class Employees implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	// private Long rowid;
	private String employee_id;
	private String first_name;
	private String last_name;
	private String email;
	private String phone_number;
	private String job_id;
	private BigDecimal salary;
	private java.sql.Date hire_date;

	public Employees() {
	}

	/*
	 * public Long getId() { return rowid; }
	 * 
	 * public void setId(Long rowid) { this.rowid = rowid; }
	 */
	public String getemployee_id() {
		return employee_id;
	}

	public void setemployee_id(String employee_id) {
		this.employee_id = employee_id;
	}

	public String getfirst_name() {
		return first_name;
	}

	public void setfirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getlast_name() {
		return last_name;
	}

	public void setlast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getphone_number() {
		return phone_number;
	}

	public void setphone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getjob_id() {
		return job_id;
	}

	public void setjob_id(String job_id) {
		this.job_id = job_id;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public java.sql.Date gethire_date() {
		return hire_date;
	}

	public void sethire_date(java.sql.Date hire_date) {
		this.hire_date = hire_date;
	}

}
