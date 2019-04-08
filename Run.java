public class Marker{
	
	private int mid;
	private String color;
	private String company;
	private float height;
	private float width;
	
	Marker(int mid,String color,String company,float height,float width)
	{
	this.mid=mid;
	this.color=color;
	this.company=company;
	this.height=height;
	this.width=width;
	}


	
	System.out.println(mid);
	System.out.println(company);	
	System.out.println(color);	
	System.out.println(height);
	System.out.println(width);

	void write()
	{
	System.out.println("Writing with marker");
	}

}

public class Run{


  public static void main(String args[])
{
	Marker blackMarker = new Marker(100,"black","markera pvt ltd",8.30f,2.0f);

	

	/*blackMarker.mid = 100;
	blackMarker.company = "markers pvt ltd";
	blackMarker.color="BLACK";
	blackMarker.height=8.0f;
	blackMarker.width=2.0f;*/
	
	/*System.out.println(blackMarker.mid);
	System.out.println(blackMarker.company);	
	System.out.println(blackMarker.color);	
	System.out.println(blackMarker.height);
	System.out.println(blackMarker.width);
	*/

	blackMarker.write();

}

}

