class CreditCardAccount
{

private int accountNumber;
private float rewardPoints;
private  double transAmount;
private String accountType;

void setAccountNumber(int accountNumber)
{this.accountNumber=accountNumber;}

void setRewardPoints(float rewardPoints)
{this.rewardPoints=rewardPoints;}

void setTransAmount(double transAmount)
{this.transAmount=transAmount;}

void setAccountType(String accountType)
{this.accountType=accountType;}

int getAccountNumber()
{return this.accountNumber;}

float getRewardPoints()
{return this.rewardPoints;}

double getTransAmount()
{return this.transAmount;}

String getAccountType()
{return accountType;}

void transaction ()
{
System.out.println("Account Type : "+accountType);
System.out.println("Credit card Account Number : "+accountNumber);
System.out.println("Credit card Transaction amount : "+transAmount);
System.out.println("Before Transaction Reward points : "+rewardPoints);
if(transAmount>=100)
rewardPoints+=transAmount/10;
System.out.println("Total Reward points : "+rewardPoints);

}



}

class RunCreditCard{

public static void main(String args[])
{

CreditCardAccount cc = new CreditCardAccount();
cc.setAccountNumber(10001);
cc.setRewardPoints(100.0f);
cc.setTransAmount(10000.0f);
cc.setAccountType("credit card");
cc.transaction();

System.out.println("\n");

CreditCardAccount c = new CreditCardAccount();
c.setAccountNumber(10002);
c.setRewardPoints(0.0f);
c.setTransAmount(20000.0f);
c.setAccountType("credit card");
c.transaction();

}


}