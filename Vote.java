//program to find whether candidate can vote or not
public class Vote{

//To check candidate is elegible to vote or note
public static boolean checkAge(int age)
{
boolean check = age > 18 ;
if(check)
return true;
else return false;
}

//main function 
public static void main(String args[])
{

int age = 17 ;
boolean check = checkAge(age);    //function call
if(check)
System.out.println("Valid For Vote");
else System.out.println("Not Valid To Vote");
}
		
}