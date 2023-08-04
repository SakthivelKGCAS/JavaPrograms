package ArithException;
import java.util.*;

class ValidateAgeException extends Exception
{
	ValidateAgeException(String s1)
	{
		super(s1);
	}
}

public class CustomExcep {

				
		private static int age1;
		
		static void validate2() throws ValidateAgeException
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your age:");
			age1 = sc.nextInt();
			
			if(age1 <18)
			{
				throw new ValidateAgeException("The Person is not eligible for voting");
			}
			else
			{
				System.out.println("The Person is eligible for voting");
			}
		}
					
			public static void main(String[] args) {
				try
				{
					validate2();
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			
}



