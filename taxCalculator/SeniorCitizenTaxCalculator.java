class SeniorCitizenTaxCalculator extends IndividualTaxCalculator{

SeniorCitizenTaxCalculator(float taxSlab1,float taxSlab2,float taxSlab3,int[] slabs)
{
super(taxSlab1,taxSlab2,taxSlab3,slabs);
}

public void processTax(float salary)
{

		if(salary >= 0 && salary <= slabs[0])
			tax =0.0f;

		if(salary > slabs[0] && salary <= slabs[1])
			tax = 0.0f + (salary-(slabs[1]-slabs[0]))*taxSlab1; 
		

		if(salary > slabs[1] && salary <= slabs[2])
			tax = 0.0f + ((slabs[1]-slabs[0])*taxSlab1) + (salary - slabs[1])*taxSlab2; 

		if(salary > slabs[2] && salary <= slabs[3])
			tax = 0.0f + ((slabs[1]-slabs[0])*taxSlab1) + (slabs[2]-slabs[1])*taxSlab2 + (salary-slabs[2])*taxSlab3; 

	System.out.println("Total Tax : "+(int)tax);
	System.out.println("Salary : "+(int)(salary-tax));

}

/*
public static void main(String args[])
{
SeniorCitizenTaxCalculator sTax = new SeniorCitizenTaxCalculator(0.05f,0.1f,0.2f);
sTax.processTax(700000f);

}*/

}