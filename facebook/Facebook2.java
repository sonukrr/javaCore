class Facebook2 implements IFacebook{


public void registration(String username,String password,String email,int mobile_no)
{System.out.println("You are registered : "+username+" "+password);}

public void logIn(String username,String password)
{System.out.println("successfull Log In : "+username+" "+password);}

public void doLikes(String username,String password)
{System.out.println("You liked : "+username+" "+password);}

public void doComments(String username,String password)
{System.out.println("You commented : "+username+" "+password);}


public void doShare(String username,String password)
{System.out.println("You Shared : "+username+" "+password);}

public void postTimelines(String username,String password)
{System.out.println("You posted : "+username+" "+password);}

public static void print()
{System.out.println("print method from Facebook");}
}