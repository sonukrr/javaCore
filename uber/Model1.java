package com.cts.run;               //creation of the package
import com.cts.model.Customer;     //importing the Customer class
import com.cts.model.Plan1;
import com.cts.model.Plan2;
import java.time.*;
import java.time.format.*;
import java.io.*;
import java.util.*;

public class Run 
{
    public static void logFile(String message)
{
    FileWriter fwr = null;
    BufferedWriter bwr = null;
    String path ="D://sonu//telecommunication//logFile.txt";
   
    try
    {
    fwr = new FileWriter(path);
    bwr = new BufferedWriter(fwr); 
    bwr.append(message);
    bwr.newLine();
    }
    catch(IOException ie)
    {
        System.out.println("error in creating log file");
    }
    finally
    {
        try
        {
        if(bwr != null)
        bwr.close();
        }
        catch(IOException ieo)
        {
            System.out.println("error in closing log file");
        }
    }
}
 public static void main(String[] args)
    {
             FileReader fr = null;              //for reading the data from file
             BufferedReader br = null;
             FileWriter fw = null;              //for generating the separate bill for each customer in a file
             BufferedWriter bw = null;
            
            HashMap<Long,ArrayList<Customer>> map = new LinkedHashMap<>();     //key is customer Number and list includes all his call details
    
            String file ="D://sonu//telecommunication//CDR.txt";               //file path from where data is to be read
     try
	    {
		    fr = new FileReader(file);                                         //accessing the file to read its content
		    br = new BufferedReader(fr);                                       //reading by buffer(char by char)

		    String text = null;
		    while((text = br.readLine())!= null)                               //accessing each line individually
		    {
			    String arr[] = text.split(",");                                //splitting line and storing in the array 
			    String a1=arr[0];
			    String a2=arr[1];
			    String a3=arr[2];
                String a4=arr[3];
                String a5=arr[4];
                String a6 = arr[5];
                
                //parsing all the vlaues from string to respective data types so that operation can be performed on them
                int  transactionId =Integer.parseInt(a1) ;
                long customerNo = Long.parseLong(a2);
                long noCalled = Long.parseLong(a3);
                int plan = Integer.parseInt(a4); 
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                LocalDateTime parsedDate = LocalDateTime.parse(a5,formatter);
                LocalDateTime date = parsedDate;
                int duration = Integer.parseInt(a6);

                Customer c = new Customer(transactionId, noCalled, plan, date, duration); 

                if(map.containsKey(customerNo))                             
                {                                                        
                    ArrayList<Customer> list=map.get(customerNo);            //if customer Number already exist,add the list to the corresponding existing list of that customer number 
                    list.add(c);
                }
                else
                {
                    ArrayList<Customer> list = new ArrayList<Customer>();    //if customer number deoes not exist in map,create new key-value pair i.e,new list
                    list.add(c);
                    map.put(customerNo,list);
                }    
            }
        Set<Long> keySet = map.keySet();                                     //set of all the keys in map
        Iterator<Long> iter = keySet.iterator();                             //iterator over the key values present in set
        while(iter.hasNext())
        {
            long key = iter.next();
            fw = new FileWriter("D://sonu//telecommunication//"+key+".txt");      //creating new file for each customer as its billing details 
            bw = new BufferedWriter(fw);
            ArrayList<Customer> value = map.get(key);
            int totalMin=0;
            int planFare=0;
            int talkTime=0;
            long customerNo=0;
            int diff=0;                                                             //for additional minutes
            int plan=0;
        
            for(Customer ar : value)
            {  
                totalMin+=ar.getDuration();                                         //calculating the total duration of customer number
            }
            for(Customer arr : value)
            {
                customerNo=arr.getCustomerNo();
                plan=arr.getPlan();
                if(arr.getPlan()==1)
                {
                 Plan1 p = new Plan1();
                planFare=p.getPlanFare();                                                        //depending on plan of customer,determining the additional minutes 
                talkTime=p.getTalkTime();
                diff=p.calcMin(totalMin);
                }
                else
                {
                    Plan2 p = new Plan2();
                    planFare=p.getPlanFare();
                    talkTime=p.getTalkTime();
                    diff=p.calcMin(totalMin);
                }
            }
                //printing the bill generated to the console and at same time to new file created 
                bw.append("Bill for "+key+" (Plan "+plan+")");                      
                bw.newLine();
                bw.newLine();
                System.out.println("Bill for "+key+" (Plan "+plan+")");
                System.out.println();

                bw.append("Item Description                                        Amount");
                bw.newLine();
                System.out.println("Item Description                                        Amount");

                bw.append("================                                        =======");
                bw.newLine();
                System.out.println("================                                        =======");

                bw.append("Base talk time fare                                     "+String.format("%5d",planFare));
                bw.newLine();
                System.out.println("Base talk time fare                                     "+String.format("%5d",planFare));

                bw.append("Additional talk time fare  ("+diff+" minutes)                "+String.format("%5d",diff));
                bw.newLine();
                System.out.println("Additional talk time fare  ("+diff+" minutes)                "+String.format("%5d",diff));

                bw.append("                                                        ========");
                bw.newLine();
                System.out.println("                                                        ========");

                bw.append("Amount to pay                                           "+String.format("%5d",(planFare+diff)));
                bw.newLine();
                System.out.println("Amount to pay                                           "+String.format("%5d",(planFare+diff)));

                bw.append("                                                        ========");
                bw.newLine();
                System.out.println("                                                        ========");

                bw.append("Call Details");
                bw.newLine();
                System.out.println("Call Details");

                bw.append("==============");
                bw.newLine();
                System.out.println("==============");

                bw.append("Date                    Called Number                  Duration");
                bw.newLine();
                System.out.println("Date                    Called Number                  Duration");

                bw.append("=====================   =============                 ==========");
                bw.newLine();
                System.out.println("=====================   =============                 ==========");
                for(Customer arr : value)
                {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                String dateString = arr.getDate().format(formatter);
                    bw.append(dateString+"      "+arr.getNoCalled()+"                   "+String.format("%5d",arr.getDuration()));
                    bw.newLine();
                    System.out.println(dateString+"      "+arr.getNoCalled()+"                   "+String.format("%5d",arr.getDuration()));
                }
                bw.append("                                                     ============");
                bw.newLine();
               System.out.println("                                                     ============");

               bw.append("Total call duration                                   "+String.format("%5d",totalMin));
               bw.newLine();
               System.out.println("Total call duration                                   "+String.format("%5d",totalMin));

               bw.append("                                                     ============");
               bw.newLine();
               System.out.println("                                                     ============");

               bw.append("Additional minutes  ("+totalMin+"-"+talkTime+")                         "+String.format("%5d",diff));
               bw.newLine();
               System.out.println("Additional minutes  ("+totalMin+"-"+talkTime+")                         "+String.format("%5d",diff));

               bw.append("                                                     ============");
               bw.newLine();
               System.out.println("                                                     ============");

               bw.append("\n\n");
               bw.newLine();
                System.out.println("\n\n");
                bw.close();                                         //closing the current file 
                //end of the bill file of a individual customer
            }
        
        }
         catch(FileNotFoundException f)
         {
                System.out.println("ERROR: file not found ");
                Run.logFile(f.getMessage());
         }
        catch(IOException io)
        {
            System.out.println("file cannot be opened");   
            Run.logFile(io.getMessage());
        }
      
        finally
         {
            try
            {
		    if(br != null)                                    //closing of all the files we have used or created 
            br.close();
            bw.close();
            }
            catch(IOException i)
            {
            System.out.println(i);
            Run.logFile(i.getMessage());
            }
            catch(NullPointerException n)
            {System.out.println();
            Run.logFile(n.getMessage());}
         } 
    }
}
