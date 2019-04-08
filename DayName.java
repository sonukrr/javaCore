import java.util.Scanner;
class DayName{

public static void weekDay(int Day)
{
if(Day > 0)
{
if(Day == 1)
System.out.println("Monday");
else if(Day == 2)
System.out.println("Tuesday");
else if(Day == 3)
System.out.println("Wednesday");
else if(Day == 4)
System.out.println("Thursday");
else if(Day == 5)
System.out.println("Friday");
else if(Day == 6)
System.out.println("Saturday");
else if(Day == 7)
System.out.println("Sunday");
}
else System.out.println("Enter in range 1 - 7");
}

public static void main(String args[])
{
	Scanner sc = new Scanner(System.in) ;
	int n = sc.nextInt(); 
	weekDay(n);
}
}