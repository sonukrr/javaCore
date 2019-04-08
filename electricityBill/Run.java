import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.*;
import java.util.Set;
import java.util.*;


public class Run 
{
 public static void main(String[] args) 
    {

             FileReader fr = null;
             BufferedReader br = null;
             FileWriter fw = null;
             BufferedWriter bw = null;
            
            HashMap<Integer,ArrayList<Customer>> map = new LinkedHashMap<>();
    
            String file ="D://sonu//electricityBill//data.txt";
            String billFile="D://sonu//electricityBill//billing.txt";
    
     try
	    {
		    fr = new FileReader(file);
		    br = new BufferedReader(fr);

		    String text = null;
		    while((text = br.readLine())!= null)
		    {
			    String arr[] = text.split(",");
			    String a1=arr[0];
			    String a2=arr[1];
			    String a3=arr[2];
                String a4=arr[3];
                String a5=arr[4];
                String a6 = arr[5];
                String a7 = arr[6];

                int  billNo =Integer.parseInt(a1) ;
            
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                LocalDateTime parsedDate = LocalDateTime.parse(a2, formatter);
                LocalDateTime billDate = parsedDate;

                int uscnNo = Integer.parseInt(a3);
                int serviceNo = Integer.parseInt(a4);
                int presentReading = Integer.parseInt(a5);
                int previousReading = Integer.parseInt(a6); 
                int phase = Integer.parseInt(a7);        

                Customer c = new Customer(billNo, billDate,serviceNo,presentReading,previousReading,phase); 
                
                if(map.containsKey(uscnNo))
                {
                    ArrayList<Customer> list=map.get(uscnNo);
                    list.add(c);
                    map.put(uscnNo,list);
                }
                else
                {
                    ArrayList<Customer> list = new ArrayList<Customer>();
                    list.add(c);
                    map.put(uscnNo,list);
                }    
            }

        Set<Integer> keySet = map.keySet();
        Iterator<Integer> iter = keySet.iterator();
        while(iter.hasNext())
        {
           
            int key = iter.next();
            ArrayList<Customer> value = map.get(key);
            for(Customer arr : value)
            {
                int diff;
                float amount=0.0f;
                if(arr.getPhase()==2)
                {
                    diff=arr.getPresentReading()-arr.getPreviousReading();
                   amount=Phase2.calculateBill(diff);
                }
                else 
                {
                    diff=arr.getPresentReading()-arr.getPreviousReading();
                   amount=Phase3.calculateBill(diff);
                }
                String d[] = new String(arr.getBillDate());
               
                String date = d[0];
                String time = d[1];
                System.out.println("Bill No :"+arr.getBillNo()+"            Dt: "+date+"            Time: "+time);
                System.out.println("---------------------------------------------------------------------");
                
                System.out.println("SNo: "+arr.getServiceNo()+"	                                           Phase: "+arr.getPhase());
                System.out.println("---------------------------------------------------------------------");
                System.out.println("UCNO: "+key);
                System.out.println("---------------------------------------------------------------------");
                System.out.println("Pres : "+arr.getPresentReading());
                System.out.println("Prev : "+arr.getPreviousReading());
                System.out.println("Total : "+diff);
                System.out.println("---------------------------------------------------------------------");
                System.out.println("Bill                       :");

        

           
           
           
                System.out.println("\n\n");
            }




        }
        }
        
         catch(FileNotFoundException f)
         {
                System.out.println("ERROR: file not found ");
         }
        catch(IOException io)
        {
            System.out.println("file cannot be opened");
           
        }
        finally
         {
            try
            {
		    if(br != null)
            br.close();
            }
            catch(IOException i)
            {
            System.out.println(i);
            }
         }
  
    }
}
