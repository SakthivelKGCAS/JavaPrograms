package ClassandObjects;
class Fib
{
	int i,n, n1,n2,n3;
	
	void getData(int x)
	{
		n =x;
	}
	void process()
	{
		n1 = 0;
		n2 = 1;
		n3 = n1+n2;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		for(i=1;i<=n;i++)
		{
			n1 = n2;
			n2 = n3;
			n3 = n1+n2;
			
			System.out.println(n3);
		}
	
	}
	
	//static method 
	public static int sum(int a1, int b1)
	{
		int a ,b;
		a = a1;
		b = b1;
		
		return a+b;
	}
}

public class ClassFiB {

	public static void main(String[] args) {
		
		Fib f = new Fib();
		f.getData(10);
		f.process();
		
		// static method call
		int c = Fib.sum(20,50);
		System.out.println("Static method:"+c);
		
	}

}
