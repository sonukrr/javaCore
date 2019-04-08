package com.bank.credit;
import com.bank.saving.Accounts;
public class CreditCardUsingInheritance extends Accounts{

private float rewardPoints;

public void setRewardPoints(float rewardPoints)
{this.rewardPoints=rewardPoints;}

public float getRewardPoints()
{return this.rewardPoints;}

public void transaction ()
{
System.out.println("Account Type : "+getAccountType());
System.out.println("Credit card Account Number : "+getAccountNumber());
System.out.println("Credit card Transaction amount : "+getTransAmount());
System.out.println("Before Transaction Reward points : "+rewardPoints);
if(getTransAmount()>=100)
rewardPoints+=getTransAmount()/10;
System.out.println("Total Reward points : "+rewardPoints);

}

public CreditCardUsingInheritance(int accountNumber,float rewardPoints,double transAmount,String accountType)
{
super(accountNumber,transAmount,accountType);
this.rewardPoints=rewardPoints;
}



}