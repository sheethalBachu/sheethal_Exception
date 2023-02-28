package exception;

public class Exception3 {

	public static void main(String[] args) {
		int a[]={20,30,35,40};
		System.out.println(a[0]);
		try {
		System.out.println(a[4]);
		}
		catch(Exception e) {
			System.out.println("error your array index is " +a.length);
		}
		
		
	}

}
