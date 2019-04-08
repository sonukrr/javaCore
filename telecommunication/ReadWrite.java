package com.cts.model;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import com.cts.model.Customer;
import java.time.*;
import java.time.format.*;
import java.io.*;
import java.util.*;

public class ReadWrite
{
    public void read (BufferedReader br, HashMap<Long,ArrayList<Customer>> map ) throws IOException
    {
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
    }
    
    public void write(BufferedWriter bw,HashMap<Long,ArrayList<Customer>> map,long key ) throws IOException
    {
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