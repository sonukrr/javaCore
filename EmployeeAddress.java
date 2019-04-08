class EmployeeAddress
{
public static void main(String args[])
	{

	Address a = new Address();
	Employee e = new Employee();
	CalculateTax ct = new CalculateTax();
	String data[]=new String[]{"1414,sonu kumar,700000,171,New Delhi,Delhi",
			"2414,Abhishek kumar,700000,271,New Delhi,Delhi",
			"3314,Raju Srivastava,700000,371,Lucknow,Uttar Pradesh"};

	for(int i=0 ; i<data.length ; i++)
	{
		String arr[] = data[i].split(",");   //split data 0 at every , (comma) and store in arr[0], arr[1], arr[2] ......
		e.setEid(Integer.parseInt(arr[0]));
		e.setName(arr[1]);
		e.setSalary(Double.parseDouble(arr[2]));
		a.setStreetNumber(Integer.parseInt(arr[3]));
		a.setState(arr[4]);
		a.setCity(arr[5]);

		ct.setSalary(e.getSalary());
		
		System.out.println("Employee ID : "+e.getEid());
		System.out.println("Employee Name : "+e.getName());
		System.out.println("Employee CTC : "+e.getSalary());
		System.out.println("Salary after Tax Deduction : "+ct.getSalary());
		System.out.println("Employee Address : "+a.getStreetNumber()+" "+a.getCity()+" "+a.getState());
		System.out.println();
		System.out.println();

	}




/*	e.setName("sonu kumar");
	e.setEid(141425);
	e.setSalary(7000000);
	a.setStreetNumber(111);
	a.setState("DELHI");
	a.setCity("NEW DELHI");
	ct.setSalary(700000);
	System.out.println(e.getEid());
	System.out.println(e.getName());
	System.out.println(ct.getSalary());
	System.out.println(a.getStreetNumber());
	System.out.println(a.getState());
	System.out.println(a.getCity());
*/
}
}