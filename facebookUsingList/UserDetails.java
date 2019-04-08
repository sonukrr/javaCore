public class UserDetails{

    private String userName;
    private String password;
    private String emailId;
    private String mobileNo;

    
    public UserDetails(String userName,String password)
    {
    this.userName = username;
    this.password = password;
    }

    public UserDetails(String userName, String password, String emailId, String mobileNo)
    {
        this.userName = userName;
        this.passWord = password;
        this.emailId = emailId;
        this.mobileNo = mobileNo;
    }

    
    public void setUsername(String username)
    { this.username = username; }

    public void setPassword(String password)
    { this.password = password; }

    public void setEmail(String email)
    { this.email = email; }

    public void setMobileNo(String mobileNo)
    { this.mobileNo = mobileNo; }

    public String getUsername()
    { return this.username; }

    public String getPassword()
    { return this.password; }

public String  getEmail()
{
return this.email ;
}

public String getMobileNo()
{
return this.mobileNo;
}

    
    public String toString()
    {
        return " name : "+username+" password : "+password+" email: "+email+"mobileNo : "+mobileNo;
    }
}