class BankImpl implements IBank{



public void readDataFile()
{

	System.out.println("reading data from file");
}

public void processTax(float salary)
{
	System.out.println("Tax successfully calculated");

}

public static void main(String args[])
{

IBank b = new BankImpl();   //can access all the methods in common[run time and compile time poly]
b.readDataFile();
b.processTax(20000f);


}

}