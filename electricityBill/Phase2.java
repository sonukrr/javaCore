public class Phase2
{
    
  static  public float calculateBill(int reading)                                                                
    {
        if(reading>=1 && reading<100)
        {   int count=1;
            float total = reading * 3.0f;
            return total;
        }
        else 
        if(reading>=100 && reading<200)
        {   int count =2;
            float total = (100*3.0f) + (reading - 100f)*3.5f ;
            return total;
        }
        else 
        if(reading>=200 && reading<300)
        {   int count=3;
            float total = (100*3.0f) + (100*3.5f)+(reading - 200f)*4f ;
            return total;
        }
        else 
        if(reading>=300 && reading<400)
        {
            int count=4;
            float total = (100*3.0f) + (100*3.5f)+(100*4.0f)+(reading - 300)*5.0f ;
            return total;
        }
        else 
        if(reading>=400 && reading<500)
        {
            int count=5;
            float total = (100*3.0f) + (100*3.5f)+(100*4.0f)+(100*5.0f)+(reading - 400)*6.0f ;
            return total;
        }
        else 
        if(reading>=500 && reading<600)
        {
            int count=6;
            float total = (100*3.0f) + (100*3.5f)+(100*4.0f)+(100*5.0f)+(100*6.0f)+(reading - 500)*7.0f ;
            return total;
        }
        else 
        if(reading>=600 && reading<700)
        {
            int count=7;
            float total = (100*3.0f) + (100*3.5f)+(100*4.0f)+(100*5.0f)+(100*6.0f)+(100*7.0f)+(reading - 600)*7.5f ;
            return total;
        }
        else 
        if(reading>=700 && reading<800)
        {
            int count=8;
            float total = (100*3.0f) + (100*3.5f)+(100*4)+(100*5)+(100*6)+(100*7)+(100*7.5f)+(reading - 700)*8 ;
            return total;
        }
        else 
        if(reading>=800 && reading<900)
        {
            int count=9;
            float total = (100*3.0f) + (100*3.5f)+(100*4)+(100*5)+(100*6)+(100*7)+(100*7.5f)+(100*8)+(reading - 800)*9 ;
            return total;
        }
        else 
        if(reading>=900 )
        {
            int count=10;
            float total = (100*3.0f) + (100*3.5f)+(100*4)+(100*5)+(100*6)+(100*7)+(100*7.5f)+(100*8)+(100*9)+(reading - 900)*10 ;
            return total;
        }

        else return 0;
    }

}