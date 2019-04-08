public class Marker{
	
	private int mid;
	private String color;
	private String company;
	private float height;
	private float width;
	
	void write()
	{
	System.out.println("Writing with marker");
	}

}

public class Run{


  public static void main(String args[])
{
	Marker blackMarker = new Marker();
	Marker whiteMarker = new Marker();
	Marker blueMarker = new Marker();

	blackMarker.mid = 100;
	blackMarker.company = "markers pvt ltd";
	blackMarker.color="BLACK";
	blackMarker.height=8.0f;
	blackMarker.width=2.0f;

	System.out.println(blackMarker.mid);
	System.out.println(blackMarker.company);	
	System.out.println(blackMarker.color);	
	System.out.println(blackMarker.height);
	System.out.println(blackMarker.width);
	blackMarker.write();

	System.out.println(whiteMarker);
	System.out.println(blueMarker);


}

}

