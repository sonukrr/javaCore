package com.facebook.run;
import com.facebook.model.UserDetails;
import com.facebook.model.IFacebook;
import com.facebook.service.Facebook;
public class Run{

public static void main(String args[])
{
UserDetails user1 = new UserDetails("sonu","passk@123","sonu@gmail.com","886075744");
System.out.println(user1);

System.out.println(user1.hashCode());

UserDetails user2 = new UserDetails("sonu","pass@123","sonu@gmail.com","886075744");
System.out.println(user2);

//boolean same = user1.equals(user2);  //it will give false because it compares the hash code or references of two object. 

boolean same = user1.equals(user2);  //now it will give true coz it is overriden in userdetails .
System.out.println("Are users same using overriden equals() :"+same);
System.out.println("Are users same :"+UserDetails.compare(user1,user2));
}
}