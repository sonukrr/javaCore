package com.facebook.model;
public class UserDetails{

private String username;
private String password;
private String email;
private String mobileNo;

public void setUsername(String username)
{
this.username = username;
}

public void setPassword(String password)
{
this.password = password;
}

public void setEmail(String email)
{
this.email = email;
}

public void setMobileNo(String mobileNo)
{
this.mobileNo = mobileNo;
}



public String getUsername()
{
return this.username;
}

public String getPassword()
{
return this.password;
}

public String  getEmail()
{
return this.email ;
}

public String getMobileNo()
{
return this.mobileNo;
}


public UserDetails(String username,String password)
{
this.username = username;
this.password = password;
}


public UserDetails(String username,String password,String email,String mobileNo)
{
this.username = username;
this.password = password;
this.email = email;
this.mobileNo = mobileNo;
}

public static boolean compare(UserDetails ud1,UserDetails ud2)
{
if(ud1.getUsername()==ud2.getUsername() && ud1.getPassword()==ud2.getPassword() && ud1.getEmail().equals(ud2.getEmail()) && ud1.getMobileNo().equals(ud2.getMobileNo()))
return true;
else return false;
}

public boolean equals(UserDetails ud)
{
if(this.username.equals(ud.getUsername()) && this.password.equals(ud.getPassword()) && this.email==ud.getEmail() && this.mobileNo==ud.getMobileNo())
return true;
else return false;
}

public String toString()
{return " name : "+username+" password : "+password+" email: "+email+"mobileNo : "+mobileNo;}

}