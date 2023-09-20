package com.example.demo.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.*;
//import javax.persistence.Table;

//import org.springframework.boot.autoconfigure.domain.EntityScan;

//@jakarta.persistence.Entity
//@EntityScan
//@Entity
//@Table(name = "EMPLOYEES")
//@Document(collection = "EMPLOYEES")
@EntityScan(basePackages = "com.example.demo.entities")
@Entity
@Table(name = "EMPLOYEES")
public class Employees implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Long id;
	private String employeeid;
	private String firstname;
	private String lastname;
	private String email;
	private String phonenumber;
	private String jobid;
	private BigDecimal salary;
	private java.sql.Date hiredate;

	public Employees() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getJobid() {
		return jobid;
	}

	public void setJobid(String jobid) {
		this.jobid = jobid;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public java.sql.Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(java.sql.Date hiredate) {
		this.hiredate = hiredate;
	}

	@Override
	public String toString() {
		return "Employees [id=" + id + ", employeeid=" + employeeid + ", firstname=" + firstname + ", lastname="
				+ lastname + ", email=" + email + ", phonenumber=" + phonenumber + ", jobid=" + jobid + ", salary="
				+ salary + ", hiredate=" + hiredate + ", getId()=" + getId() + ", getEmployeeid()=" + getEmployeeid()
				+ ", getFirstname()=" + getFirstname() + ", getLastname()=" + getLastname() + ", getEmail()="
				+ getEmail() + ", getPhonenumber()=" + getPhonenumber() + ", getJobid()=" + getJobid()
				+ ", getSalary()=" + getSalary() + ", getHiredate()=" + getHiredate() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
