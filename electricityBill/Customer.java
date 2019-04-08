import java.time.LocalDateTime;

public class Customer
{
    private int billNo;
    private LocalDateTime billDate;
    private int uscnNo;
    private int serviceNo;
    private int presentReading;
    private int previousReading;
    private int phase;

public Customer(int billNo, LocalDateTime billDate,int serviceNo, int presentReading,int previousReading,int phase )
{
    this.billNo=billNo;
    this.billDate=billDate;
    this.serviceNo= serviceNo;
    this.presentReading= presentReading;
    this.previousReading= previousReading;
    this.phase= phase;
}


public void setBillNo(int billNo)
{ this. billNo = billNo;}

public void setBillDate(LocalDateTime billDate)
{this.billDate=billDate;}

public void setUscnNo(int uscnNo)
{this.uscnNo = uscnNo;}

public void setServiceNo(int serviceNo)
{this.serviceNo= serviceNo;}

public void setPresentReading(int presentReading)
{this.presentReading= presentReading;}

public void setPreviousReading(int previousReading)
{ this.previousReading= previousReading;}

public void setPhase(int phase)
{ this.phase= phase; }


public int getBillNo()
{ return this. billNo;}

public LocalDateTime getBillDate()
{return this.billDate;}

public int  getUscnNo()
{return this.uscnNo;}

public int getServiceNo()
{return this.serviceNo;}

public int getPresentReading()
{return this.presentReading;}

public int getPreviousReading()
{ return this.previousReading;}

public int  getPhase()
{ return this.phase; }

public String toString()
{return  billNo+"   "+billDate+"   "+uscnNo+"   "+serviceNo+"   "+presentReading+"   "+previousReading+"   "+phase ; }

}