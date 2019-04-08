package com.payroll.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.payroll.exceptions.PayrollException;
import com.payroll.model.Address;
import com.payroll.model.Department;
import com.payroll.model.Employee;
import com.payroll.util.ConnectionUtil;

public class EmployeeDAO {

	public List<Employee> fetchAllData(String name)throws PayrollException
	{
		List<Employee> list = new ArrayList<Employee>();
		
		String query = "select e.*,ed.*,d.*,group_concat(s.skill_name) as skills from employee e"
				+ " inner join emp_address ed"
				+ " inner join department d "
				+ " inner join skills s"
				+ " inner join emp_skillset sk"
				+ " on ed.address_id=e.fk_address_id"
				+ " and e.fk_dept_id=d.dept_id"
				+ " and e.emp_id=sk.fk_emp_id"
				+ " and s.skill_id=sk.fk_skill_id"
				+ " group by e.emp_id";
		
		String queryByName = "select e.*,ed.*,d.*,group_concat(s.skill_name) as skills from employee e"
				+ " inner join emp_address ed"
				+ " inner join department d "
				+ " inner join skills s"
				+ " inner join emp_skillset sk"
				+ " on ed.address_id=e.fk_address_id"
				+ " and e.fk_dept_id=d.dept_id"
				+ " and e.emp_id=sk.fk_emp_id"
				+ " and s.skill_id=sk.fk_skill_id"
				+ " where e.emp_name like ? group by e.emp_id";
		
		Connection conn = null;
		PreparedStatement stmt=null;
		ResultSet rs =null;
		
		try {
			conn=ConnectionUtil.getConnection();
			if(name==null)
			{
				stmt=conn.prepareStatement(query);
				System.out.println(query);
			}else
			{
				stmt=conn.prepareStatement(queryByName);
				stmt.setString(1, "%"+name+"%");
				System.out.println(queryByName);
			}
			rs = stmt.executeQuery();
			
			while(rs.next())
			{
				
				int empId = rs.getInt("emp_id");
				String empName = rs.getString("emp_name");
				double empSalary = rs.getFloat(3);
				
				int deptId=rs.getInt(4);
				String deptName = rs.getString(5);
				String deptLocation = rs.getString(6);
				Department dept = new Department(deptId, deptName, deptLocation);
				
				int addressId=rs.getInt("address_id");
				String street = rs.getString("street");
				String city = rs.getString("city");
				String state = rs.getString("state");
				String country = rs.getString("country");
				
				String skills = rs.getString(12);
				
				Address ad = new Address(addressId, street, city, state, country);
				
				Employee employee = new Employee(empId, empName, empSalary, dept, ad, skills);
				list.add(employee);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally{
			try{

				if(rs!=null){
					rs.close();
				}
				if(stmt!=null){
					stmt.close();
				}
				if(conn!=null){
					conn.close();
				}
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			
		}
		
		return list;
	}
	
	public int registerEmployee(Connection connObj,Employee employee) throws PayrollException
	{
		int generatedIdEmp=0;
		
	   String query="insert into employee(emp_name,emp_salary,fk_address_id,fk_dept_id) values(?,?,?,?)";
	   PreparedStatement pstmt=null;
	   ResultSet result = null;
	
		   try {
			
		
			
			pstmt = connObj.prepareStatement(query);
			pstmt.setString(1, employee.getEmpName());
			pstmt.setDouble(2, employee.getEmpSalary());
			pstmt.setInt(3, employee.getAddress().getAddressId());
			pstmt.setInt(4, employee.getDepartment().getDepartmentId());
			
			pstmt.executeUpdate();
			
			result = pstmt.getGeneratedKeys();
			if(result.next())
			{
				generatedIdEmp = result.getInt(1);
			}
			   
			   
		} catch (Exception e) {
			
			
			// TODO Auto-generated catch block
			throw new PayrollException("error in employee"+e);
		}finally{
				
			try{

				if(result!=null){
					result.close();
				}
				if(pstmt!=null){
					pstmt.close();
				}
				}
				catch(Exception e)
				{
					throw new PayrollException("error in employee"+e);
				}
			
			}
		   return generatedIdEmp;
		}
		
}
