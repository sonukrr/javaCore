package com.cts.run;
import com.cts.user.UserDetails;
import com.cts.server.FacebookServer;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.io.*;

public class Facebook{
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println();
        
        LocalTime time = LocalTime.now();
        System.out.println(time);
        System.out.println();
        
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        System.out.println();
        
       FacebookServer fbs = new FacebookServer();
        Scanner sc = new Scanner(System.in);
    //    System.out.println("Enter the number of users you want to create");
    //   int usrNo = sc.nextInt();
    
        
        String file="D:\\sonu\\facebookMain\\fbData.txt";
        try 
        {
            
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String line;
            // Uncomment the line below if you want to skip the fist line (e.g if headers)
           // line = br.readLine();
        
            while ((line = br.readLine()) != null) 
            {
               String arr[] = line.split(",");
               UserDetails user = new UserDetails(arr[0],arr[1],arr[2],arr[3]);
               fbs.setList(user);
            }
          //  System.out.println(fbs.getList());
           // System.out.println(fbs.getList().stream().count());
            
            //fbs.getList().forEach(a->System.out.println(a));
            //System.out.println();
            fbs.getList().forEach(System.out::println);
            System.out.println("\n");

            List<UserDetails> user = fbs.getList().stream().filter( ud1->ud1.getUsername().equals("aziz") ).collect(Collectors.toList());
            System.out.println(user);

            br.close();
        
        } 
        catch (IOException e) 
        {
            System.out.println("ERROR: unable to read file " + file);
            e.printStackTrace();   
        }
        
        
      //  List<UserDetails> list = new ArrayList<UserDetails>();
     
     /*   for(int i=0 ; i<usrNo ; i++)
        {
            System.out.println("Enter the "+ (i+1) +" user details");
            System.out.println("Enter the user details in <username , password , mail id , mobile no >");
            
            UserDetails user = new UserDetails(sc.next(), sc.next(), sc.next(), sc.next());
            list.add(user);
            fbs.setList(user);
	        System.out.println();
        }*/


      System.out.println();
      System.out.println("Enter the login info in <username , password >");
      UserDetails usr = new UserDetails(sc.next() , sc.next());

      
      if(fbs.validateUser(usr.getUsername(),usr.getPassword()))
      System.out.println("user logged in");
     else System.out.println("Login unsuccessfull");

     System.out.println();
     System.out.println("Enter name of the user to be searched :");
     System.out.println(fbs.getByUsername(sc.next()));
     
     System.out.println();
     System.out.println("Enter email of the user to be searched :");
     System.out.println(fbs.getByEmail(sc.next()));

     System.out.println();
     System.out.println("Enter phone of the user to be searched :");
     System.out.println(fbs.getByphone(sc.next()));

      
     LocalDateTime dateTimee = LocalDateTime.now();
     System.out.println(dateTimee);
     System.out.println();

    }
}