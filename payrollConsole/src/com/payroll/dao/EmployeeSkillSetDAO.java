package com.payroll.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.payroll.exceptions.PayrollException;
import com.payroll.model.EmployeeSkillSet;

public class EmployeeSkillSetDAO {

	public EmployeeSkillSetDAO() {
		// TODO Auto-generated constructor stub
	}

	public int registerEmployeeSkillSetDAO(Connection connObj,EmployeeSkillSet employeeSkillSet) throws PayrollException
	{
	   int generatedId= 0;
	  
	   String query="insert into emp_skillset(fk_skill_id,fk_emp_id) values(?,?)";

	   PreparedStatement pstmt=null;
	   ResultSet result = null;
	
		   try {
			
			pstmt = connObj.prepareStatement(query);
			pstmt.setInt(1, employeeSkillSet.getSkill().getSkillId());
			pstmt.setDouble(2, employeeSkillSet.getEmployee().getEmpId());
		
			
	pstmt.executeUpdate();
			
			result = pstmt.getGeneratedKeys();
			if(result.next())
			{
				generatedId = result.getInt(1);
			}
			   
		
			   
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new PayrollException("error in employee skill set"+e);
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
					throw new PayrollException("error in employee skill set"+e);
				}
			
			}
		   return generatedId;
		}
		
}
