package com.bank.run;
import com.bank.credit.CreditCardUsingInheritance;
import com.bank.saving.Accounts;

public class RunCreditCard{

public static void main(String args[])
{

CreditCardUsingInheritance cc = new CreditCardUsingInheritance(10001,100.0f,10000.0f,"CREDIT CARD");
cc.transaction();

System.out.println("\n");

}


}