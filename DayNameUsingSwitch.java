import java.util.Scanner;
class DayNameUsingSwitch{

public static void weekDay(int Day)
{
String days[]={"monday","tuesday","wednesday","Thursday","Friday","Saturday","Sunday"}; 

String d = "Day is : ";
//switch can also be implemented by passing string.
switch(Day)
{
case 1:
	System.out.println(d+days[0]);
	break;
case 2:
	System.out.println(d+days[1]);
	break;
case 3:
	System.out.println(d+days[2]);
	break;
case 4:
	System.out.println(d+days[3]);
	break;
case 5:
	System.out.println(d+days[4]);
	break;

case 6:
	System.out.println(d+days[5]);
	break;
case 7:
	System.out.println(d+days[6]);
break;

default:System.out.println("Enter in range 1 - 7");
}

}

public static void main(String args[])
{
	Scanner sc = new Scanner(System.in) ;
	int n = sc.nextInt(); 
	weekDay(n);
}
}