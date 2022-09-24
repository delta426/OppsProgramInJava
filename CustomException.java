class Bank
{
   public void withdraw() throws InsufficientBalanceException
   {
      double balance=100.00;
	  double withdraw=200.00;
	  if(balance>=withdraw)
	  {
	      System.out.println("Successful transaction");
	  }else{
	      throw new InsufficientBalanceException("Not enough balance");
	  }
   }
}
class InsufficientBalanceException extends Exception
{
    String message;
	InsufficientBalanceException(String message)
	{
	    this.message=message;
	}
	public String getMessage()
	{
	    return message;
	}
}
public class CustomException 
{
     public static void main(String[] args) throws Exception
	 {
	     try
		 {
			Bank b1=new Bank();
		    b1.withdraw();
		 }catch(InsufficientBalanceException e)
		 {
		    System.out.println(e.getMessage()); 
		 }
	 }

}
