package com.cts.model;
public class Plan1
{
    
    private int planFare=0;
    private int talkTime=0;
    private int chargeRate;
    
   public Plan1()
    {
        this.planFare=100;
        this.talkTime=200;
        this.chargeRate=1;

    }

    public void setPlanFare(int planFare)
    {this.planFare=planFare;}

    public void setTalkTime(int talkTime)
    {this.talkTime=talkTime;}

    public void setChargeRate(int chargeRate)
    {this.chargeRate=chargeRate;}

    public int getPlanFare()
    {return this.planFare;}

    public int  getTalkTime()
    {return this.talkTime;}

    public int  getChargeRate(int chargeRate)
    {return this.chargeRate;}

    public int calcMin(int totalMin)
    {
        int additionalMin = totalMin-talkTime;
        return additionalMin;
    }

    public int totalAmount(int totalMin)
    {
        int amt = ((totalMin-talkTime)*chargeRate)+planFare ;
        return amt;
    }

}