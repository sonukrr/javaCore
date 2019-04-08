import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.lang.Thread;
public class Account
{

//static String data[];
/*
static{
	data =new String[]{"100,50000,D,50000",
		"101,50000,D,50000",
		"102,50000,W,50000"};
	}
*/

public static void transaction(int accountNumber,double balanceAmount, char transType ,double transAmount)
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

public static void main(String args[]) throws InterruptedException
{	
	/*FileReader fr = null;
	BufferedReader br = null;
	*/
	ExecutorService pool = Executors.newFixedThreadPool(5);

	ThreadRun tr1 = new ThreadRun("d:\\sonu\\data.txt");
	Thread1 tr2 = new Thread1("d:\\sonu\\data1.txt");
	Thread tr = new Thread(tr2);

//	tr1.join();           //to make the running of two threads separately one after the other  
//	tr2.join();
	pool.execute(tr1);
	tr1.sleep(1000);
	pool.execute(tr2);
	pool.shutdown();
	
//	tr1.start();
//	tr1.sleep(1000);
//	tr2.start();

/*	try
	{
		fr = new FileReader("d:\\sonu\\data.txt");
		br = new BufferedReader(fr);

		String text = null;
		while((text = br.readLine())!= null)
		{
			String arr[] = text.split(",");
			String a1=arr[0];
			String a2=arr[1];
			String a3=arr[2];
			String a4=arr[3];

			int accountNumber = Integer.parseInt(a1) ;
			double balanceAmount  = Double.parseDouble(a2);
			char transType = a3.charAt(0);
			double transAmount = Double.parseDouble(a4);
			transaction(accountNumber, balanceAmount,transType , transAmount);
			Thread.sleep(10000);
		}
	}catch(FileNotFoundException f)
	{System.out.println("ERROR: file not found ");}
	catch(IOException io)
	{System.out.println("file cannot be opened");}

		finally{
			try{
			if(br != null)
			br.close();}
			catch(IOException i)
			{System.out.println(i);}
		}
		
	for (int i=0 ; i<data.length ; i++)
	{
	String arr[] = data[i].split(",");
	String a1=arr[0];
	String a2=arr[1];
	String a3=arr[2];
	String a4=arr[3];
	int accountNumber = Integer.parseInt(a1) ;
	double balanceAmount  = Double.parseDouble(a2);
	char transType = a3.charAt(0);
	double transAmount = Double.parseDouble(a4);
	transaction(accountNumber, balanceAmount,transType , transAmount);
	}

*/	
}
}