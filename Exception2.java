package exception;

public class Exception2 {

	public static void main(String[] args) {
		int i=30;
		int j=0;
		
		
		//throwable is a super class of all error an Exceptions in Java
		//Exception  is a parent class of all the Exceptions(Example::null pointer,arithmetic Exception.....
		
		try {
		int k=i/j;
		System.out.println("the value of k is" +k);
		}
		catch(Exception e)
		{
			System.out.println("error" +e.getMessage());
		}
		
	
		System.out.println("hello world");
		
		

	}

}
