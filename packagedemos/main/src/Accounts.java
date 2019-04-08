package com.bank.saving;
public class Accounts
{

static String data[];

static{
	data =new String[]{"100,50000,D,100000,false",
		"101,50000,D,50000,true",
		"102,100000,W,50000,false",
		"103,100000,W,50000,true"};
	}

public Accounts(int accountNumber,double transAmount,String accountType)
{
	this.accountNumber = accountNumber;
	this.transAmount = transAmount;
	this.accountType=accountType;
}
private int accountNumber;
private double balanceAmount;
private char transType;
private double transAmount;
private String accountType;
private boolean isPriviledgedAccount=false;

public void setAccountNumber(int accountNumber)
	{this.accountNumber = accountNumber;}

public void setBalanceAmount(double balanceAmount)
	{this.balanceAmount = balanceAmount;}

public void setTransType(char transType)
	{this.transType = transType;}

public void setTransAmount(double transAmount)
	{this.transAmount = transAmount;}

public void setAccountType(String accountType)
	{this.accountType=accountType;}

public void setIsPriviledgedAccount(boolean isPriviledgedAccount)
	{this.isPriviledgedAccount=isPriviledgedAccount;}

public int getAccountNumber()
	{return this.accountNumber;}

public double getBalanceAmount()
	{ return this.balanceAmount;}

public char getTransType()
	{return this.transType;}

public double getTransAmount()
	{return this.transAmount;}

public String getAccountType()
	{return accountType;}

public boolean getIsPriviledgedAccount()
	{return this.isPriviledgedAccount;}

public void transaction()
{
	System.out.println("ACCOUNT TYPE : "+accountType);
	System.out.println("ACCOUNT NUMBER : "+accountNumber);
	System.out.println("Before transaction BALANCE is : "+balanceAmount);

	if(transType == 'D')
	{
		if(transAmount>=100000)
		{
		balanceAmount += transAmount ;
		System.out.println("Extra 2% interest for depositing above 1 LAKH : "+(0.2*balanceAmount));
		balanceAmount +=0.2*balanceAmount;
		}else balanceAmount += transAmount ;}

	else if(transType == 'W' && balanceAmount >=transAmount)
	{	
	if(transAmount>=10000 && isPriviledgedAccount==false)
	{
	System.out.println("Is not priviledged account");
	double charge=transAmount/10000 * 10;
	balanceAmount -= charge;
	System.out.println("Amount debited for withdrawing above 10000 INR @Rs10 per 10000 : "+charge);}
	else System.out.println("Is priviledged account");
	 balanceAmount -= transAmount ;
}

System.out.println("After transaction BALANCE is : "+balanceAmount);
System.out.println();
}
}
