package com.facebook.run;
import com.facebook.model.UserDetails;
import com.facebook.service.Facebook;
import com.facebook.model.IFacebook;
public class FacebookRun{

public static void main(String args[])
{
UserDetails uInfo = new UserDetails("sonu","pass@123","sonu@gmail.com","886075744");
UserDetails uInfo1 = new UserDetails("sonu","pass@123");
//passing as an object
IFacebook f = new Facebook();
f.registration(uInfo);
f.logIn(uInfo1);
f.doLikes(uInfo1);
f.doComments(uInfo1);
f.doShare(uInfo1);
f.postTimelines(uInfo1);
Facebook.print();
System.out.println("\n\n");

/*
IFacebook f2=new Facebook2();
f2.registration("sonu","pass@123","sonu@gmial.com","88601111");
f2.logIn("sonu","pass@123");
f2.doLikes("sonu","pass@123");
f2.doComments("sonu","pass@123");
f2.doShare("sonu","pass@123");
f2.postTimelines("sonu","pass@123");
Facebook2.print();
*/



}

}