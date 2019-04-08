
class CreditCardUsingInheritance extends Accounts{

private float rewardPoints;

void setRewardPoints(float rewardPoints)
{this.rewardPoints=rewardPoints;}

float getRewardPoints()
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

CreditCardUsingInheritance(int accountNumber,float rewardPoints,double transAmount,String accountType)
{
super(accountNumber,transAmount,accountType);
this.rewardPoints=rewardPoints;
}
public static void main(String args[])
{

CreditCardUsingInheritance cc = new CreditCardUsingInheritance(1001,100.0f,10000.0f,"credit card");;
cc.transaction();

/*cc.setAccountNumber(10001);
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
*/

}


}