class HUFTaxCalculator extends IndividualTaxCalculator{

HUFTaxCalculator(float taxSlab1,float taxSlab2,float taxSlab3,int[] slabs)
{
super(taxSlab1,taxSlab2,taxSlab3,slabs);

}
public static void main(String args[])
{

int slabs[]={250000,500000,700000,1000000};
HUFTaxCalculator hTax = new HUFTaxCalculator(0.5f,0.2f,0.4f,slabs);
hTax.processTax(700000f);

IndividualTaxCalculator hTax1 = new HUFTaxCalculator(0.5f,0.2f,0.4f,slabs);
hTax1.processTax(700000f);
}


}