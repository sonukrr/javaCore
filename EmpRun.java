package company.cognizant.ems.run;
import company.cognizant.ems.exception.CountryInvalidException;
import company.cognizant.ems.model.EmployeeException;
public class EmpRun{

public static void main(String args[])
{
EmployeeException e = new EmployeeException();
try{
e.countryCheck();
}catch(CountryInvalidException cie){
System.out.println(cie.getMessage());
cie.printStackTrace();
}

}


}