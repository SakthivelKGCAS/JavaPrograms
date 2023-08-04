package ArithException;

public class ArithDemo {
	public static void main(String[] args) {
		
		int a = 10;
		try
		{
			int b = a/0; 
			System.out.println(b);
	}
	catch(Exception e1)
	{
		System.out.println("Dividing a number by Zero"+e1);
	}
		System.out.println("Rest of Code");
	}

}
