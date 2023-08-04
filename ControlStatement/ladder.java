package ControlStatement;

public class ladder {
	public static void main(String[] args) {
		int a=15,b=8,c=10;
		if((a>b)&&(a>c))
		{
			System.out.println("A is Greatest:  "+a);
		}
		else if(b>c)
		{
			System.out.println("B is Greatest:  "+b);
		}
		else
		{
			System.out.println("C is Greatest:  "+c);
		}
	}
}
