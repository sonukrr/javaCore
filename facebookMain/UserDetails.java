package com.cts.user;
public class UserDetails
{
    private String username;
    private String password;
    private String email;
    private String mobileNo;

public UserDetails(String username,String password,String email,String mobileNo)
{
    this.username = username;
    this.password = password;
    this.email = email;
    this.mobileNo = mobileNo;
}

public UserDetails(String username , String password)
{
    this.username=username;
    this.password= password;
}


public void setUsername(String username)
{this.username = username;}

public void setPassword(String password)
{this.password = password;}

public void setEmail(String email)
{this.email = email;}

public void setMobileNo(String mobileNo)
{this.mobileNo = mobileNo;}


public String getUsername()
{return this.username;}

public String getPassword()
{return this.password;}

public String  getEmail()
{return this.email;}

public String getMobileNo()
{return this.mobileNo;}

public String toString()
{return "->name : "+username+" ->password : "+password+" ->email : "+email+" ->mobileNo : "+mobileNo;}

}