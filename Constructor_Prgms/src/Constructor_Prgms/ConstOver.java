package Constructor_Prgms;
class Area
{
	int a,r;
	double pi,l,b;
	
	Area(int a)
	{
		this.a = a;
		 System.out.println("Area of Square: "+(a*a));
	}
	Area(double pi,int r)
	{
		this.pi = pi;
		this. r = r;
		
		System.out.println("Area of Circle: "+(pi*r*r));
	}
	Area(double l,double b)
	{
		this.l = l;
		this.b = b;
		 System.out.println("Area of Rectangle: "+(l*b));
	}
	
}
public class ConstOver {
	public static void main(String[] args) {
		
		Area a1 = new Area(5);
		Area a2 = new Area(6.5,9.0);
		Area a3 = new Area(3.14,4);
		
	}
	
	 

}
