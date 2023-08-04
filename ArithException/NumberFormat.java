package ArithException;

public class NumberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Null Pointer Exception
				try
				{
					String s = "KGiSL";
					int a = Integer.parseInt(s);
					System.out.println(a);
				}
				catch(NumberFormatException e1)
				{
					System.out.println("Access the null String"+e1);
				}
				System.out.println("Rest of Code");
	}

}
