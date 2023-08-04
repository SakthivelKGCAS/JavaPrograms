package ArithException;
public class NestedTry {
	public static void main(String[] args) {
		
		try
		{
			int a= 10/2;
			System.out.println("Outer Try1:  "+a);
			try
				{
					String s = "Hello";
					System.out.println("Outer Try2:  "+s.charAt(8));
					try
					{
						int n[] = {45,58,8,2,5,11};
						System.out.println("Inner try:  "+n[3]);
					}
					catch(ArrayIndexOutOfBoundsException e)
					{
						System.out.println(e);
					}
				}
				catch(StringIndexOutOfBoundsException e)
				{
					System.out.println(e);
				}
				
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}

}
