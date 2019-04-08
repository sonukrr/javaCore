import java.time.LocalDateTime;

public class UserDetails
{
    private String userId;
    private LocalDateTime date;
    private String source;
    private String destination;
    private float fare;

public UserDetails(LocalDateTime date, String source, String destination, float fare)
{
    this.date=date;
    this.source=source;
    this.destination=destination;
    this.fare = fare;
}


public void setUserId(String userId)
{ this. userId = userId;}

public void setDate(LocalDateTime date)
{this.date=date;}

public void setSource(String source)
{this.source = source;}

public void setDestination(String destination)
{this.destination= destination;}

public void setfare(float fare)
{this.fare= fare;}

public String getUserId()
{return this.userId;}

public LocalDateTime getDate()
{return this.date;}

public String  getSource()
{return this.source;}

public String getDestination()
{return this.destination;}

public float getFare()
{return this.fare;}

public String toString()
{return  "->date : "+date+" ->source : "+source+" ->destination : "+destination+" ->fare : "+fare;}

}