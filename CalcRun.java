package com.cts.calculator.run;
import com.cts.calculator.*;
public class CalcRun{

public static void main(String args[]) //throws null pointer exception
{

Calculator calc = null;
int result;

if(calc==null)
{
calc=new Calculator();
result=calc.addition(10,20);
System.out.println("Object successfully created and Addition of two numbers : "+result);
}else {
calc.addition(10,20);
System.out.println("Without the creation of the object");

}
/*try{
calc = null;
System.out.println("Try block ");
}
catch(NullPointerException e)
{
System.out.println("Catch block ");
calc=new Calculator();}

System.out.println("After Catch  ");
int result = calc.addition(10,20);
System.out.println("Addition of two numbers : "+result);

 result = calc.division(10,0);
System.out.println("Division of two numbers : "+result);

*/
}

} 