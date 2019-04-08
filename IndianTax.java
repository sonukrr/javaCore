//Indian Tax slab 
class IndianTax{

public static void main(String args[])
{
		float taxSlab1=0.1;
		float taxSlab2=0.2;
		float taxSlab3=0.3;
		

		float salary = 700000f ;
		float tax = 0.0f;
		int age=72;
		if(age<60)
	{
		if(salary >= 0 && salary <= 250000)
			tax =0.0f;

		if(salary > 250000 && salary <= 500000)
		{
			tax = 0.0f + (salary-250000)*0.1f; 
		}

		if(salary > 500000 && salary <= 700000)
		{
			tax = 0.0f + (250000*0.1f) + (salary - 500000)*0.2f; 
		}

		if(salary > 700000 && salary <= 1000000)
		{
			tax = 0.0f + (250000*0.1f) + (200000)*0.2f + (salary-700000)*0.3f; 
		}

	System.out.println("Total Tax : "+tax);
	System.out.println("Salary : "+(salary-tax));

	}
	else if(age >= 60 && age<=80)
	{
	if(salary >= 0 && salary <= 250000)
			tax =0.0f;

		if(salary > 250000 && salary <= 500000)
		{
			tax = 0.0f + (salary-250000)*0.05f; 
		}

		if(salary > 500000 && salary <= 700000)
		{
			tax = 0.0f + (250000*0.1f) + (salary - 500000)*0.1f; 
		}

		if(salary > 700000 && salary <= 1000000)
		{
			tax = 0.0f + (250000*0.1f) + (200000)*0.2f + (salary-700000)*0.2f; 
		}

	System.out.println("Total Tax : "+tax);
	System.out.println("Salary : "+(salary-tax));}
	
	else System.out.println("No Tax applicable for individuals above 80 yrs of age");
	}
		}