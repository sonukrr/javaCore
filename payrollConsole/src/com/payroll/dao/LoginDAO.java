package com.payroll.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.payroll.exceptions.PayrollException;
import com.payroll.model.LoginDetails;
import com.payroll.util.ConnectionUtil;

public class LoginDAO {

	public LoginDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean loginCheck(LoginDetails logindetails)throws PayrollException
	{
		boolean flag = false;
		String query = "select * from login where username=? and password=?";
		
		Connection connObj=null;
		PreparedStatement pstmt=null;
		ResultSet result = null;
		
		try{
			connObj=ConnectionUtil.getConnection();
			pstmt=connObj.prepareStatement(query);
			
			pstmt.setString(1,logindetails.getUsername());
			pstmt.setString(2,logindetails.getPassword());
			
			result=pstmt.executeQuery(); 
			
			if(result.next())
			{
				flag=true;
			}
		}
		catch(Exception e)
		{
			throw new PayrollException("error in login"+e);
		}
		finally
		{
			if(result!=null)
			{
				try{
					result.close();
				}catch(Exception e){
					throw new PayrollException("error in login"+e);
				}
			}
			if(pstmt!=null)
			{
				try{
					pstmt.close();
				}catch(SQLException e){
					throw new PayrollException("error in login"+e);
				}
			}
			if(connObj!=null)
			{
				try{
					connObj.close();
				}catch(SQLException e){
					throw new PayrollException("error in login"+e);
				}
			}
		}
		
		
		return flag;
	}

}
