package com.yash.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;
@Entity
public class Doctor {
	@Id
	private int did;
	private String dname;
	private String specialist;
	private int dfees;
	private double dsalary;
	@OneToOne(cascade = CascadeType.ALL)
	private Department department;
	
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public int getDfees() {
		return dfees;
	}
	public void setDfees(int dfees) {
		this.dfees = dfees;
	}
	public double getDsalary() {
		return dsalary;
	}
	public void setDsalary(double dsalary) {
		this.dsalary = dsalary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	

}
