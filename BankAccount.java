import java.util.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class BankAccount
{


public static void main(String args[])
{	
	System.out.println(new Date());
	System.out.println(System.currentTimeMillis());
	Scanner sc = new Scanner(System.in);

	ArrayList list = new ArrayList();   //we can also use generics to store the elements with same type
	for(int i=0;i<Account.data.length;i++)
	{
		list.add(Accounts.data[i]);
	}

	//for(Object var : list)
	//{System.out.println(var);}

	Iterator iter = list.iterator();          //we can also use generics  
	while(iter.hasNext())
	{
		Object o = iter.next();
		if(o.equals("100,50000,D,100000,false"))
		iter.remove();
	} 
	//to print the objects in the ARRAY
	for(int i=0;i<list.size();i++)
	System.out.println(list.get(i));

	for(Object var : list)        //var will store the data[0],then data[1] etc....
	{System.out.println(var);}

 	/* int size = Accounts.data.length;
 	 Accounts accountsArr[]=new Accounts[size];
	
	for(int i=0;i<Accounts.data.length;i++)
	{
	Accounts ac = new Accounts();
	accountsArr[i]=ac;
	String arr[] = Accounts.data[i].split(",");
	String a1=arr[0];
	String a2=arr[1];
	String a3=arr[2];
	String a4=arr[3];
	String a5=arr[4];

	ac.setAccountNumber(Integer.parseInt(a1) );
	ac.setBalanceAmount(Double.parseDouble(a2));
	ac.setTransType(a3.charAt(0));
	ac.setTransAmount(Double.parseDouble(a4));
	ac.setAccountType("Debit Card");	
	ac.setIsPriviledgedAccount(Boolean.parseBoolean(a5));
	ac.transaction();
	}
	System.out.println("Enter the account number to search");
	int accno = sc.nextInt();
	
	for(int i=0 ;i<accountsArr.length;i++ )
	{
		if(accountsArr[i].getAccountNumber()==accno)
		{
			System.out.println(accountsArr[i]+" account found");
			break;
		}else {System.out.println("No such account found");
					break;}
	}
	*/
}}
