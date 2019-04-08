package com.bank.run;
import com.bank.credit.CreditCardUsingInheritance;
import com.bank.saving.Accounts;
import com.bank.exception.InsufficientBalanceException;

public class RunCreditCard{

public static void main(String args[])
{

CreditCardUsingInheritance cc = new CreditCardUsingInheritance(10001,100.0f,100000.0f,"CREDIT CARD");
try{
cc.transaction();
}catch(InsufficientBalanceException i)
{System.out.println(i.getMessage());
i.printStackTrace();
}

System.out.println("\n");

}


}