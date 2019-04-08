class CreditCardAccount
{

private int accountNumber;
private float rewardPoints;
private  double transAmount;

void setAccountNumber(int accountNumber)
{this.accountNumber=accountNumber;}

void setRewardPoints(float rewardPoints)
{this.rewardPoints=rewardPoints;}

void setTransAmount(double transAmount)
{this.transAmount=transAmount;}

int getAccountNumber()
{return this.accountNumber;}

float getRewardPoints()
{return this.rewardPoints;}

double getTransAmount()
{return this.transAmount;}

void transaction (CreditCardAccount cc)
{
System.out.println("Credit card Account Number : "+cc.accountNumber);
System.out.println("Credit card Transaction amount : "+cc.transAmount);
System.out.println("Before Transaction Reward points : "+cc.rewardPoints);
if(cc.transAmount>=100)
cc.rewardPoints+=cc.transAmount/10;
System.out.println("Total Reward points : "+cc.rewardPoints);

}



}

class RunCreditCard{

public static void main(String args[])
{

CreditCardAccount cc = new CreditCardAccount();
cc.setAccountNumber(10001);
cc.setRewardPoints(100.0f);
cc.setTransAmount(1000.0f);
cc.transaction(cc);

}


}