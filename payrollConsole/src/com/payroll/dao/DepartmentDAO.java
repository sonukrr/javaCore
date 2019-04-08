package com.payroll.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.payroll.exceptions.PayrollException;
import com.payroll.model.Department;

public class DepartmentDAO {

	
	public int registerDepartment(Connection connObj,Department department) throws PayrollException
	{
		int generatedId=0;
	  
	   String query="insert into department(dept_name,dept_location) values(?,?)";
	   PreparedStatement pstmt=null;
	   ResultSet result = null;
	
		   try {
			
			pstmt = connObj.prepareStatement(query);
			pstmt.setString(1,department.getDepartmentName());
			pstmt.setString(2, department.getDepartmentLocation());
		
			pstmt.executeUpdate();
			
			result = pstmt.getGeneratedKeys();
			if(result.next())
			{
				generatedId = result.getInt(1);
			}
			   
		
			   
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new PayrollException("error in department"+e);
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
					throw new PayrollException("error in department"+e);
				}
			
			}
		   return generatedId;
		}
}
