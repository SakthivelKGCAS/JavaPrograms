package Constructor_Prgms;

class StrRev
{
	String s;
	int i;
	StrRev(String s) // Parameter Constructor
	{
		this.s = s;
	}
	void display()
	{
		for(i=s.length()-1;i>=0;i--)
		{
		System.out.print(s.charAt(i));
		}
		
	}
}
public class Parameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StrRev obj = new StrRev("Naveen");
		obj.display();

	}

}
