package AccessModifierPgms;
class RBI
{
	protected void interestRate()
	{
		System.out.println("SBI Interest Rate is 8.5 for Saving Account");
	}
}

class CNB extends RBI
{
	protected void interestCnb()
	{
		super.interestRate();
	}
}

class RajFinance 
{
	void interest()
	{
		super.interestRate();
	}
}

public class DemoAcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CNB obj = new CNB();
		obj.interestCnb();
		
		RajFinance obj2 = new RajFinance();
		obj2.interest();

	}

}
