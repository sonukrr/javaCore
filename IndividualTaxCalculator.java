class IndividualTaxCalculator{

private float taxSlab1;
private float taxSlab2;
private float taxSlab3;
private float tax;
int slabs[]=new int[4];

IndividualTaxCalculator(float taxSlab1,float taxSlab2,float taxSlab3,int[] slabs){
this.taxSlab1=taxSlab1;
this.taxSlab2=taxSlab2;
this.taxSlab3=taxSlab3;
this.slabs=slabs;
}
void setSlabs(int slabs[])
{this.slabs=slabs;}

int[] getSlabs()
{ return this.slabs;}


void setTaxSlab1(float taxSlab1)
{this.taxSlab1 = taxSlab1;}

void setTaxSlab2(float taxSlab2)
{this.taxSlab2 = taxSlab2;}

void setTaxSlab3(float taxSlab3)
{this.taxSlab3 = taxSlab3;}


float getTaxSlab1()
{ return this.taxSlab1;}

float getTaxSlab2()
{return this.taxSlab2;}

float getTaxSlab3()
{return this.taxSlab3 ;}

void display()
{System.out.println("display method from IndividualTaxCalculator");}

void processTax(float salary)
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


public static void main(String args[])
{
int slabs[]={250000,500000,700000,1000000};
IndividualTaxCalculator itc = new IndividualTaxCalculator(0.1f,0.2f,0.3f,slabs);
itc.processTax(700000f);

}


}