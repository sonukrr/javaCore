package com.cts.model;                        //creation of the package
import java.time.LocalDateTime;

public class Customer
{
    private int transactionId;
    private long customerNo;
    private long noCalled;
    private int plan;
    private LocalDateTime date;
    private int duration;
    
//for implementation of array list in maps
public Customer(int transactionId,long noCalled, int plan,LocalDateTime date,int duration )
{
    this.transactionId=transactionId;
    this.noCalled=noCalled;
    this.plan= plan;
    this.date= date;
    this.duration= duration;
    
}
//providing setters 
public void setCustomerNo(long customerNo)
{this.customerNo=customerNo;}

public void setTransactionId(int transactionId)
{ this.transactionId=transactionId;}

public void setNoCalled(long noCalled)
{this.noCalled=noCalled;}

public void setPlan(int plan)
{ this.plan= plan;}

public void setDate(LocalDateTime date)
{this.date= date;}

public void setDuration(int duration)
{this.duration= duration;}

//providing getters 
public long getCustomerNo()
{return this.customerNo;}

public int getTransactionId()
{ return this. transactionId;}

public long getNoCalled()
{return this.noCalled;}

public int getPlan()
{return this.plan;}

public LocalDateTime getDate()
{return this.date;}

public int getDuration()
{return this.duration;}

//overriding toString method 
public String toString()
{return  transactionId+"   "+customerNo+"   "+noCalled+"   "+plan+"   "+date+"   "+duration;}

}