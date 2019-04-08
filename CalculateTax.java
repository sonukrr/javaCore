class CalculateTax
{
	private double salary;
	private double tax;
	
	public void setSalary(double salary)
	{
		this.salary = salary ;
	
	}

	
	public void TaxCalculator()
	{


		if(salary >= 0 && salary <= 250000)
			this.tax =0.0f;

		if(salary > 250000 && salary <= 500000)
		{
			this.tax = 0.0f + (salary-250000)*0.1f; 
		}

		if(salary > 500000 && salary <= 700000)
		{
			this.tax = 0.0f + (250000*0.1f) + (salary - 500000)*0.2f; 
		}

		if(salary > 700000 && salary <= 1000000)
		{
			this.tax = 0.0f + (250000*0.1f) + (200000)*0.2f + (salary-700000)*0.3f; 
		}
	
	}

	public double getSalary()
	{	TaxCalculator();
	return ((float)(this.salary-this.tax));
	}

}