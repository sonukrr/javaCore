package com.cts.run;               //creation of the package
import com.cts.model.Customer;     //importing the Customer class
import com.cts.model.Plan1;
import com.cts.model.Plan2;
import java.time.*;
import java.time.format.*;
import java.io.*;
import java.util.*;
import com.cts.model.ReadWrite;

public class Run 
{
    public static void logFile(String message)
{
    FileWriter fwr = null;
    BufferedWriter bwr = null;
    String path ="D://sonu//teleComm//logFile.txt";
   
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
        ReadWrite rw = new ReadWrite();
             FileReader fr = null;              //for reading the data from file
             BufferedReader br = null;
             FileWriter fw = null;              //for generating the separate bill for each customer in a file
             BufferedWriter bw = null;
            
            HashMap<Long,ArrayList<Customer>> map = new LinkedHashMap<>();     //key is customer Number and list includes all his call details
    
            String file ="CDR.txt";               //file path from where data is to be read
     try
	    {
		    fr = new FileReader(file);                                         //accessing the file to read its content
		    br = new BufferedReader(fr);                                       //reading by buffer(char by char)
            rw.read(br,map);
		    
            
        Set<Long> keySet = map.keySet();                                     //set of all the keys in map
        Iterator<Long> iter = keySet.iterator();                             //iterator over the key values present in set
        while(iter.hasNext())
        {
            long key = iter.next();
            fw = new FileWriter("D://sonu//teleComm//bin//bills//"+key+".txt");      //creating new file for each customer as its billing details 
            bw = new BufferedWriter(fw);
           rw.write(bw,map,key);
        
        }}
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
