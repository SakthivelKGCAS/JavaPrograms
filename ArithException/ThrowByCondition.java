package ArithException;

public class ThrowByCondition {
	public static void main(String[] args) {
		
		Valid.validate(91);
	}

}

class Valid
{
	public static void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("The Person is not eligible for voting");
		}
		else
		{
			System.out.println("The Person is eligible for voting");
		}
	}
}