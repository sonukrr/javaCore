package com.payroll.app;

import java.util.ArrayList;
import java.util.List;

import com.payroll.dao.EmployeeDAO;
import com.payroll.dao.LoginDAO;
import com.payroll.exceptions.PayrollException;
import com.payroll.model.Employee;
import com.payroll.model.LoginDetails;

public class MainClass {



	public static void main(String[] args) {
		
		LoginDetails login = new LoginDetails("sonu", "pass");
		LoginDAO dao = new LoginDAO();

		boolean check;
		try {
			check = dao.loginCheck(login);
			if (check) {
				System.out.println("Logged in" + "  Home page displayed");

			} else {
				System.out.println("Cannot login" + "  Error page");
			}
		} 
		catch (PayrollException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		EmployeeDAO ed = new EmployeeDAO();
		List<Employee> list = new ArrayList<Employee>();
		
		try 
		{
			list=ed.fetchAllData("samy");
		}
		catch (PayrollException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		list.forEach(System.out::println);
		/*
		Connection connection = null;
		try {
			connection = ConnectionUtil.getConnection();
			connection.setAutoCommit(false);

			Department d = new Department(30, "TR", "Hyd");
			Address address = new Address(0, "Redhouse", "chennai", "TN", "India");

			Skills skill1 = new Skills(6, "python");
			Skills skill2 = new Skills(5, "c");

			List<Skills> list = new ArrayList<Skills>();
			list.add(skill1);
			list.add(skill2);

			AddressDAO addressDao = new AddressDAO();
			int addressId = addressDao.registerAddress(connection, address);
			address.setAddressId(addressId);
			
	
			Employee employee = new Employee(0, "samy", 900000);
			employee.setAddress(address);
			employee.setDepartment(d);

			EmployeeDAO empDao = new EmployeeDAO();
			int empId = empDao.registerEmployee(connection, employee);
			System.out.println("The emp registered" + empId);
			employee.setEmpId(empId);

			EmployeeSkillSet skillSet1 = new EmployeeSkillSet(0, skill1, employee);
			EmployeeSkillSet skillSet2 = new EmployeeSkillSet(0, skill2, employee);

			EmployeeSkillSetDAO empSkillset = new EmployeeSkillSetDAO();
			empSkillset.registerEmployeeSkillSetDAO(connection, skillSet1);
			empSkillset.registerEmployeeSkillSetDAO(connection, skillSet2);

			connection.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block

			if (connection != null) {
				try {
					connection.rollback();
					connection.close();
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			e.printStackTrace();
		}
		 catch (PayrollException e) {
			
				if (connection != null) {
					try {
						connection.rollback();
						connection.close();
						
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
				System.out.println(e.getMessage());
		
			}*/

	}

}
