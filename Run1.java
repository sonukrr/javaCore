
class Account{

int accountNumber;
double balanceAmount;
char transType;
double transAmount;

 Account(String data) 
	{
	String arr[] = data.split(",");
	String a1=arr[0];
	String a2=arr[1];
	String a3=arr[2];
	String a4=arr[3];
	accountNumber = Integer.parseInt(a1) ;
	balanceAmount  = Double.parseDouble(a2);
	transType = a3.charAt(0);
	transAmount = Double.parseDouble(a4);
	}
	

public void transaction()
{

System.out.println("ACCOUNT NUMBER : "+accountNumber);
System.out.println("Before transaction BALANCE is : "+balanceAmount);

if(transType == 'D')
balanceAmount += transAmount ;
else if(transType == 'W' && balanceAmount >= transAmount)
balanceAmount -= transAmount ;

System.out.println("After transaction BALANCE is : "+balanceAmount);
System.out.println();
}
}

class Run1
{

public static void main(String args[])
{	
	Account ac = new Account("100,50000,D,50000");
	ac.transaction();
	
	
}}
