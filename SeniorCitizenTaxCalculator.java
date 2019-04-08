class SeniorCitizenTaxCalculator extends IndividualTaxCalculator{

SeniorCitizenTaxCalculator(float taxSlab1,float taxSlab2,float taxSlab3,int []slabs)
{
super(taxSlab1,taxSlab2,taxSlab3,slabs);

}

private float tax;

void show()
{System.out.println("show method from SeniorCitizenTaxCalculator");}

void processTax(float salary)
{
	System.out.println("I am from  process method of senior citizen tax calculator ");
		if(salary >= 0 && salary <= slabs[0])
			tax =0.0f;

		if(salary > slabs[0] && salary <= slabs[1])
			tax = 0.0f + (salary-(slabs[1]-slabs[0]))*getTaxSlab1(); 
		

		if(salary > slabs[1] && salary <= slabs[2])
			tax = 0.0f + ((slabs[1]-slabs[0])*getTaxSlab1()) + (salary - slabs[1])*getTaxSlab2(); 

		if(salary > slabs[2] && salary <= slabs[3])
			tax = 0.0f + ((slabs[1]-slabs[0])*getTaxSlab1()) + (slabs[2]-slabs[1])*getTaxSlab2() + (salary-slabs[2])*getTaxSlab3(); 

	System.out.println("Total Tax : "+(int)tax);
	System.out.println("Salary : "+(int)(salary-tax));

}

public void print()
{System.out.println("This is print method from SeniorCitizanTaxCalculator ");}

public static void main(String args[])
{
int slabs[]={250000,500000,700000,1000000};
SeniorCitizenTaxCalculator sTax = new SeniorCitizenTaxCalculator(0.05f,0.1f,0.2f,slabs);
sTax.processTax(700000f);
sTax.print();              //is accessible here
System.out.println("\n\n");

//IndividualTaxCalculator obj can store the object of SeniorCitizenTaxCalculator[Left outer join]

IndividualTaxCalculator sTax1 = new SeniorCitizenTaxCalculator(0.05f,0.1f,0.2f,slabs);
sTax1.processTax(700000f);
//sTax1.print();  [can't access this method as its not common and not present in super class,gives error]
sTax1.display();
//sTax1.show();   [can't access]
//ALL methods of INDIVIDUALTAXCALCULATOR WHICH IS NOT THERE IN SENIOR TAX CALCULATOR
//CALL THE OVERRIDEN METHOD FROM SENIORTAXCALCULATOR[all methods in common]
}
}