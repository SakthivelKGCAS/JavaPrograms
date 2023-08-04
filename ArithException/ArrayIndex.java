package ArithException;

public class ArrayIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Null Pointer Exception
				try
				{
					int a[] = {7,23,89,4,31};
					System.out.println(a[4]);
				}
				catch(ArrayIndexOutOfBoundsException e1)
				{
					System.out.println("Access the out of the index "+e1);
				}
				System.out.println("Rest of Code");
	}

}
