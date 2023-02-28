package exception;

public class Dividebyzero {

	public static void main(String[] args) {
		int i=30;
		int j=0;
		//To solve exception handling total 3 methods
		
		//1)try and catch
		try {
		int k=i/j;
		System.out.println("the value of k is" +k);
		}
		catch(ArithmeticException e)
		{
			System.out.println("error" +e.getMessage());
		}
		
	
		System.out.println("hello world");
		
		
		//1)try and catch
		//2)throwable---ruchi
		//3)throw----mitul
		
		
		
		
		


	}

}
