class Address{

private int  streetNumber;
private String state;
private String city ;

void setStreetNumber(int streetNumber)
{
	this.streetNumber=streetNumber;
}

void setState(String state)
{
	this.state=state;
}

void setCity(String city)
{
	this.city=city;
}

int getStreetNumber()
{
	return this.streetNumber;
}

String getState()
{
	return this.state;
}

String getCity()
{
	return this.city;
}


}