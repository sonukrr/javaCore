package com.payroll.model;

public class EmployeeSkillSet {

	public EmployeeSkillSet() {
		// TODO Auto-generated constructor stub
	}
	private int empSkillSetId;
	private Skills skill;
	private Employee employee;
	
	
	public EmployeeSkillSet(int empSkillSetId, Skills skill, Employee employee) {
		super();
		this.empSkillSetId = empSkillSetId;
		this.skill = skill;
		this.employee = employee;
	}
	
	
	public int getEmpSkillSetId() {
		return empSkillSetId;
	}
	public void setEmpSkillSetId(int empSkillSetId) {
		this.empSkillSetId = empSkillSetId;
	}
	public Skills getSkill() {
		return skill;
	}
	public void setSkill(Skills skill) {
		this.skill = skill;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	@Override
	public String toString() {
		return "EmployeeSkilllSet [empSkillSetId=" + empSkillSetId + ", skill=" + skill + ", employee=" + employee
				+ "]";
	}
	
	

}
