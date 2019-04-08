// Author: Sonu Kumar
// Project: CTS
// Version: 1.0

/**......
Author: Sonu Kumar
Project: CTS
 Version: 1.0
*/

/*
	 This class is for demonsstrating the Simple First JAVA Program
*/
public class Welcome{

/*This method adds two integer and returns the result */

public static int addition(int firstNumber,int secondNumber){

      //  int firstNumber=10;
      //  int secondNumber=20;
	int result = firstNumber + secondNumber ;
	System.out.println("Hello World!!");
	return result ;
}

public static void compare(int number1 , int number2)
{
boolean checkNumber = number1 > number2 ;
if(checkNumber)
System.out.println(number1+" is the greatest");
else System.out.println(number2+" is the greatest");

} 
public static void main(String args[])
	{	//Declare two variables to call the addition .
		int number1 = 90 ;
		int number2 = 50 ;
		int result = addition(number1, number2);
		System.out.println("The result after addition of first number : "+number1+" and second number : "+number2+" is :"+result); 
		compare(number1 , number2);
		System.out.println("jagjot"+10+20);
	}
}

