package ArithException;
public class MultiCatch{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Null Pointer Exception
				try
				{
					//int a[] = {7,23,89,4,31};
					String s = "KGiSL";
					
					//int n = Integer.parseInt(s);
					System.out.println(s.charAt(5));
				}
				catch(ArrayIndexOutOfBoundsException e1)
				{
					System.out.println("Access the out of the index "+e1);
				}
				catch(NumberFormatException e)
				{
					System.out.println("Number format Exception:  "+e);
				}
				catch(ArithmeticException e)
				{
					System.out.println("Dividing Number by Zero:  "+e);
				}
				catch(StringIndexOutOfBoundsException e)
				{
					System.out.println("String out of Index:  "+e);
				}
				
				finally
				{
					System.out.println("Rest of Code");
					System.out.println("Finally Block Always Exceutable whether the exception raised or not");
				}
	}

}
