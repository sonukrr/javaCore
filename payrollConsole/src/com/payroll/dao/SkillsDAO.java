package com.payroll.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.payroll.exceptions.PayrollException;
import com.payroll.model.Skills;

public class SkillsDAO {

	public SkillsDAO() {
		// TODO Auto-generated constructor stub
	}
	public int registerSkill(Connection connObj,Skills skills) throws PayrollException
	{
	   int generatedId=0;
	  
	   String query="insert into skills(skill_name) values(?)";
	 
	   PreparedStatement pstmt=null;
	   ResultSet result = null;
	
		   try {
			
			pstmt = connObj.prepareStatement(query);
			pstmt.setString(1, skills.getSkillName());

	pstmt.executeUpdate();
			
			result = pstmt.getGeneratedKeys();
			if(result.next())
			{
				generatedId = result.getInt(1);
			}
			   
		
			   
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new PayrollException("error in skills"+e);
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
					throw new PayrollException("error in skills"+e);
				}
			
			}
		   return generatedId;
		}
		
	   
	   
	}
	

