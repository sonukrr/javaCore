class BillingException extends Exception
{
    public BillingException(String message)
    {System.out.println("SORRY! Bill cannot be generated "+message);}
}