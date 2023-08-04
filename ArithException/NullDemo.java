package ArithException;

public class NullDemo {
	public static void main(String[] args) {
		
		// Null Pointer Exception
		try
		{
			String s = null;
			System.out.println(s.length());
		}
		catch(NullPointerException e1)
		{
			System.out.println("Access the null String"+e1);
		}
		System.out.println("Rest of Code");
	}
	

}
