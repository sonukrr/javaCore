public class EmployeeTax{

public static void computeTax()
{	
	char gender  = 'M' ;
	float salary = 600000.354f;
	float taxDeduction  = 0 ;
	float totalSalary  = 0;
	String country = "India";
	String message = "Tax applicable for your salary";
	
//2.5 lacs -----> no tax
//2.5 to 5 lacs ---->10%
//5 to 10 lacs ---->20%
//above 10 lacs ---->30%

if(salary> 0 && salary <= 2_50_000)
{
if(country == "India")
{System.out.println("No"+message);}
else 
{
	if(country == "US")
if(gender == 'M')
{	
	System.out.println("salary is : "+salary);
	System.out.println("country : "+country);
	System.out.println("gender is : "+gender);
	taxDeduction = 0.1f * salary ;
	System.out.println(message+taxDeduction);
	totalSalary = salary - taxDeduction ;
	System.out.println("Total salary is : "+totalSalary);
}
else{	
	System.out.println("salary is : "+salary);
	System.out.println("country : "+country);
	System.out.println("gender is : "+gender);
	taxDeduction = 0.05f * salary ;
	System.out.println(message+taxDeduction);
	totalSalary = salary - taxDeduction ;
	System.out.println("Total salary is : "+totalSalary);
}
}
}
else if(salary> 250000 && salary <= 500000)
{
if(country == "India")
{
	if(gender == 'M')
	{	
	System.out.println("salary is : "+salary);
	System.out.println("country : "+country);
	System.out.println("gender is : "+gender);
	taxDeduction = 0.1f * salary ;
	System.out.println(message+taxDeduction);
	totalSalary = salary - taxDeduction ;
	System.out.println("Total salary is : "+totalSalary);
	}
else if(gender=='F'){	
	System.out.println("salary is : "+salary);
	System.out.println("country : "+country);
	System.out.println("gender is : "+gender);
	taxDeduction = 0.2f * salary ;
	System.out.println(message+taxDeduction);
	totalSalary = salary - taxDeduction ;
	System.out.println("Total salary is : "+totalSalary);

		}
}
else if(country == "US")
{
	
if(gender == 'M')
	{	
	System.out.println("salary is : "+salary);
	System.out.println("country : "+country);
	System.out.println("gender is : "+gender);
	taxDeduction = 0.2f * salary ;
	System.out.println(message+taxDeduction);
	totalSalary = salary - taxDeduction ;
	System.out.println("Total salary is : "+totalSalary);
	}
else if(gender=='F'){	
	System.out.println("salary is : "+salary);
	System.out.println("country : "+country);
	System.out.println("gender is : "+gender);
	taxDeduction = 0.1f * salary ;
	System.out.println(message+taxDeduction);
	totalSalary = salary - taxDeduction ;
	System.out.println("Total salary is : "+totalSalary);
		}
}
}

else if(salary> 500000 && salary <= 1000000)
{
if(country == "India")
{
	if(gender == 'M')
	{	
	System.out.println("salary is : "+salary);
	System.out.println("country : "+country);
	System.out.println("gender is : "+gender);
	taxDeduction = 0.2f * salary ;
	System.out.println(message+taxDeduction);
	totalSalary = salary - taxDeduction ;
	System.out.println("Total salary is : "+totalSalary);
	}
else if(gender=='F'){	
	System.out.println("salary is : "+salary);
	System.out.println("country : "+country);
	System.out.println("gender is : "+gender);
	taxDeduction = 0.3f * salary ;
	System.out.println(message+taxDeduction);
	totalSalary = salary - taxDeduction ;
	System.out.println("Total salary is : "+totalSalary);

		}
}
else if(country == "US")
{
	
if(gender == 'M')
	{	
	System.out.println("salary is : "+salary);
	System.out.println("country : "+country);
	System.out.println("gender is : "+gender);
	taxDeduction = 0.25f * salary ;
	System.out.println(message+taxDeduction);
	totalSalary = salary - taxDeduction ;
	System.out.println("Total salary is : "+totalSalary);
	}
else if(gender=='F'){	
	System.out.println("salary is : "+salary);
	System.out.println("country : "+country);
	System.out.println("gender is : "+gender);
	taxDeduction = 0.2f * salary ;
	System.out.println(message+taxDeduction);
	totalSalary = salary - taxDeduction ;
	System.out.println("Total salary is : "+totalSalary);
		}
}
}

else if(salary>=1000000)
{
if(country == "India")
{
	if(gender == 'M' || gender== 'F')
	{	
	System.out.println("salary is : "+salary);
	System.out.println("country : "+country);
	System.out.println("gender is : "+gender);
	taxDeduction = 0.35f * salary ;
	System.out.println(message+taxDeduction);
	totalSalary = salary - taxDeduction ;
	System.out.println("Total salary is : "+totalSalary);
	}

}
else if(country == "US")
{
	
if(gender == 'M' || gender == 'F')
	{	
	System.out.println("salary is : "+salary);
	System.out.println("country : "+country);
	System.out.println("gender is : "+gender);
	taxDeduction = 0.3f * salary ;
	System.out.println(message+taxDeduction);
	totalSalary = salary - taxDeduction ;
	System.out.println("Total salary is : "+totalSalary);
	}

}
}

else if(country == "India" || country == "US")
{
if(gender != 'M' || gender != 'F')
System.out.println("NO"+message);
}
}
public static void main(String args[])
{
	computeTax();	
}
}