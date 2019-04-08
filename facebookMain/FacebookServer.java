package com.cts.server;
import com.cts.run.Facebook;
import com.cts.user.UserDetails;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FacebookServer{

   private  List<UserDetails> list = new ArrayList<UserDetails>();
   Iterator<UserDetails> itr;

    public void setList(UserDetails ud)
    {list.add(ud); }

    public List<UserDetails> getList()
    {return list;}

    public UserDetails getByUsername(String username)
    {
        itr = list.iterator();
        while(itr.hasNext())
        {
            UserDetails udi = itr.next();
            if(udi.getUsername().equals(username))
           return udi;
           
        }
        return null;
        
    }

    public UserDetails getByphone(String phone)
    {
        itr = list.iterator();
        while(itr.hasNext())
        {
            UserDetails ud = itr.next();
            if(ud.getMobileNo().equals(phone))
           return ud;
           
        }
        return null;
        
    }

    public UserDetails getByEmail(String email)
    {
        itr = list.iterator();
        while(itr.hasNext())
        {
            UserDetails ud = itr.next();
            if(ud.getEmail().equals(email))
           return ud;
           
        }
        return null;
        
    }

    public boolean validateUser(String username , String password)
    {
        
        itr = list.iterator();
        while(itr.hasNext())
        {
            UserDetails ud = itr.next();
            if(ud.getUsername().equals(username) && ud.getPassword().equals(password))
            return true;
           
        }
        return false;
        
        
    }


}