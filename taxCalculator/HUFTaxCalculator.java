class HUFTaxCalculator extends IndividualTaxCalculator{

HUFTaxCalculator(float taxSlab1,float taxSlab2,float taxSlab3)
{
super(taxSlab1,taxSlab2,taxSlab3);

}
public static void main(String args[])
{
HUFTaxCalculator hTax = new HUFTaxCalculator(0.5f,0.2f,0.4f);
hTax.processTax(700000f);

}


}