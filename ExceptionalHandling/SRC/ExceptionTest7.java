class UserException extends Exception
{

	UserException(String msg)
	{
		super(msg);

	} 



}

class ExceptionTesting
{

	void display(int x) throws  UserException
	{
		System.out.println("value of x is="+x);

 		throw new UserException("Another Exception Occured");

	}
		


}


class ExceptionTest7
{

	public static void main(String args[])
	{
		ExceptionTesting ob1=new ExceptionTesting();

		try{	

		ob1.display(50);

		}
		catch(UserException e)
		{
			System.out.println("Error found"+e.getMessage());
		
		}

	}




}