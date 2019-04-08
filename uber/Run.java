import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Run
{
    
public void logFile(String message)
{
    FileWriter fwr = null;
    BufferedWriter bwr = null;
    String path ="logfile.txt";
   
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
public static void main(String[] args) throws IOException
 {
    
    HashMap<String ,ArrayList<UserDetails>> map = new HashMap<>();
  
    ArrayList<UserDetails> mapList = new ArrayList<UserDetails>();
   
    FileReader fr = null;
    BufferedReader br = null;
   
    FileWriter fw = null;
    BufferedWriter bw = null;

    Run r = new Run();
   
    String file ="D://sonu/uber/data.txt";
    
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

            String userId =a1 ;
            
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            LocalDateTime parsedDate = LocalDateTime.parse(a2, formatter);
            LocalDateTime date = parsedDate;

            String source = a3;
            String destination = a4;
            float fare = Float.parseFloat(a5);

           UserDetails ude = new UserDetails(date, source, destination,fare); 
            if(map.containsKey(userId))
            {
                ArrayList<UserDetails> list=map.get(userId);
                list.add(ude);
                map.put(userId,list);
            }
            else
            {
                ArrayList<UserDetails> list=new ArrayList<UserDetails>();
                list.add(ude);
                map.put(userId,list);
            }

        }
        map.forEach((k,v)->System.out.println("key :"+k+" "+v+"\n"));

        map.forEach((k,v)->System.out.println( k+" :SUM= "+( v.stream().mapToDouble(i->i.getFare()).sum()  )           ));

        Set<String> keySet = map.keySet();
        Iterator<String> iter = keySet.iterator();
        while(iter.hasNext())
        {
            int k=1;
            double totalFare=0;
            int count =0;
            String key = iter.next();
            ArrayList<UserDetails> value = map.get(key);
            
            totalFare=value.stream().mapToDouble(i->i.getFare()).sum();

          /*  for(UserDetails arr : value)
            {
                count++;
                totalFare+=arr.getFare();
            }
            */

            fw = new FileWriter(key+".txt");
            bw = new BufferedWriter(fw);
            System.out.println("--------------------------------------------------------------------------------------------");
            bw.append("--------------------------------------------------------------------------------------------");
            bw.newLine();
            System.out.println("     User ID          No.of Rides        Total Amount");
            bw.append("     User ID          No.of Rides        Total Amount");
            bw.newLine();
            System.out.println("  "+key+"            "+count+"                   "+totalFare);
            bw.append("  "+key+"            "+count+"                   "+totalFare);
            bw.newLine();
            System.out.println();
            bw.newLine();
            System.out.println("  JOURNEYS  ");
            bw.append("  JOURNEYS  ");
            bw.newLine();
            System.out.println("S.no            Date                  Src                 Destination             amount");
            bw.append("S.no            Date                  Src                 Destination             amount");
            bw.newLine();
            for(UserDetails ud : value)
            {
                System.out.println(String.format("%-16d",k)+String.format("%-22s",ud.getDate().toString())+String.format("%-20s",ud.getSource())+String.format("%-24s",ud.getDestination())+ud.getFare());
                bw.append(String.format("%-16d",k)+String.format("%-22s",ud.getDate().toString())+String.format("%-20s",ud.getSource())+String.format("%-24s",ud.getDestination())+ud.getFare());
                bw.newLine();
                k++;
            }

            System.out.println();
            bw.newLine();
            System.out.println("  OFFERS  ");
            bw.append("  OFFERS  ");
            bw.newLine();
            if(totalFare>2000)
            {
                System.out.println(" 50% OFF for next Five ride ");
                bw.append(" 50% OFF for next Five ride ");
                bw.newLine();
            }
            else 
            {
                System.out.println("No offer for this user");
            bw.append("No offer for this user");
            bw.newLine();
            }
           
            System.out.println("--------------------------------------------------------------------------------------------");
            bw.append("--------------------------------------------------------------------------------------------");
            bw.newLine();
            System.out.println("\n");
            bw.newLine();
            bw.close();
            fw.close();
        }
    }
    catch(FileNotFoundException f)
    {
        System.out.println("ERROR: file not found ");
        r.logFile(f.getMessage());
    }
    catch(IOException io)
    {
        System.out.println("file cannot be opened");
        r.logFile(io.getMessage());
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
            r.logFile(i.getMessage());}
        }
    }
}