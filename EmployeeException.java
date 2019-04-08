package company.cognizant.ems.model;
import company.cognizant.ems.exception.CountryInvalidException;

public class EmployeeException {

public void countryCheck()
{
String country = "USA";
if(country.equals("India"))
{
System.out.println("Person can vote");

}else{
throw new CountryInvalidException("Person cannot vote");
}
}


}
