public class Phase3
{
 
  static  public float calculateBill(int reading)                                                                
    {
        if(reading>=1 && reading<100)
        {
           float total = reading * 13.0f;
            return total;
        }
        else 
        if(reading>=100 && reading<200)
        {
            float total = (100*13.0f) + (reading - 100)*13.5f ;
            return total;
        }
        else 
        if(reading>=200 && reading<300)
        {
           float total = (100*13) + (100*13.5f)+(reading - 200)*14.0f ;
            return total;
        }
        else 
        if(reading>=300 && reading<400)
        {
            float total = (100*13) + (100*13.5f)+(100*14)+(reading - 300)*15.0f ;
            return total;
        }
        else 
        if(reading>=400 && reading<500)
        {
           float total = (100*13) + (100*13.5f)+(100*14)+(100*15)+(reading - 400)*16 ;
            return total;
        }
        else 
        if(reading>=500 && reading<600)
        {
          float total = (100*13) + (100*13.5f)+(100*14)+(100*15)+(100*16)+(reading - 500)*17 ;
            return total;
        }
        else 
        if(reading>=600 && reading<700)
        {
            float total = (100*13.0f) + (100*13.5f)+(100*14)+(100*15)+(100*16)+(100*17)+(reading - 600)*17.5f ;
            return total;
        }
        else 
        if(reading>=700 && reading<800)
        {
            float total = (100*13) + (100*13.5f)+(100*14)+(100*15)+(100*16)+(100*17)+(100*17.5f)+(reading - 700)*18 ;
            return total;
        }
        else 
        if(reading>=800 && reading<900)
        {
           float total = (100*13) + (100*13.5f)+(100*14)+(100*15)+(100*16)+(100*17)+(100*17.5f)+(100*18)+(reading - 800)*19 ;
            return total;
        }
        else 
        if(reading>=900 )
        {
            float total = (100*13) + (100*13.5f)+(100*14)+(100*15)+(100*16)+(100*17)+(100*17.5f)+(100*18)+(100*19)+(reading - 900)*20 ;
            return total;
        }
        else return 0;
    }

}