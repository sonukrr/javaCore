import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Thread;

public class Thread1 implements Runnable{

    
   private FileReader fr = null;
   private BufferedReader br = null;
  private  String path; 

  public Thread1 (String path)
  {
      this.path = path;
  }

    public void run() {
        try
        {
            fr = new FileReader(path);
            br = new BufferedReader(fr);
    
            String text = null;
            while((text = br.readLine())!= null)
            {
                String arr[] = text.split(",");
                String a1=arr[0];
                String a2=arr[1];
                String a3=arr[2];
                String a4=arr[3];
    
                int accountNumber = Integer.parseInt(a1) ;
                double balanceAmount  = Double.parseDouble(a2);
                char transType = a3.charAt(0);
                double transAmount = Double.parseDouble(a4);
                Account.transaction(accountNumber, balanceAmount,transType , transAmount);
                
            }
        }catch(FileNotFoundException f)
        {System.out.println("ERROR: file not found ");}
        catch(IOException io)
        {System.out.println("file cannot be opened");}
    
            finally{
                try{
                if(br != null)
                br.close();}
                catch(IOException i)
                {System.out.println(i);}
            }
            
        
    }

} 