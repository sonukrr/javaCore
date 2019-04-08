package com.payroll.model;

import java.util.List;

public class Employee {

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	private String skillStr;
	private int empId;
	private String empName;
	private double empSalary;
	private Department department;
	private Address address;
	private List<Skills> skillsList;
	
	public Employee(int empId, String empName, double empSalary, Department department, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.department = department;
		this.address = address;
	}
	
	
	
	public Employee( int empId, String empName, double empSalary, Department department,Address address,String skillStr)
	{
		super();
		this.skillStr = skillStr;
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.department = department;
		this.address = address;
	}


	public Employee(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		
	}

	

	public String getSkillStr() {
		return skillStr;
	}


	public void setSkillStr(String skillStr) {
		this.skillStr = skillStr;
	}


	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public List<Skills> getSkillsList() {
		return skillsList;
	}


	public void setSkillsList(List<Skills> skillsList) {
		this.skillsList = skillsList;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", department="
				+ department + ", address=" + address + "]";
	}


	
	
	
	
}
