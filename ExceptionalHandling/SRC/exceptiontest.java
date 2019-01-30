import java.util.*;
class exceptiontest{
	public static void main(String[] args) {
		String s = null ;
        try
        {
        	if (s==null){
        		throw new Exception("U entered a null string");
        	}
        	else {
        		System.out.println("The entered String is " +s);
        	}
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
        finally{
        	System.out.println("The program executed successfully");
        }

	}
}