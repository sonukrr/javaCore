package com.payroll.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.payroll.exceptions.PayrollException;
import com.payroll.model.Address;

public class AddressDAO {

	public int registerAddress(Connection connObj,Address address) throws PayrollException
	{
	   int generatedId=0; 
	  
	   String query="insert into emp_address(street,city,state,country) values(?,?,?,?)";
	 
	   PreparedStatement pstmt=null;
	   ResultSet result = null;
	
		   try {
		
			pstmt = connObj.prepareStatement(query);
			pstmt.setString(1, address.getStreet());
			pstmt.setString(2, address.getCity());
			pstmt.setString(3, address.getState());
			pstmt.setString(4, address.getCountry());
			
			pstmt.executeUpdate();
		
			result = pstmt.getGeneratedKeys();
			if(result.next())
			{
				generatedId = result.getInt(1);
			}
			   
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new PayrollException("error in address "+e);
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
					throw new PayrollException("error in address"+e);
				}
			
			}
		   return generatedId;
		}
		
}
