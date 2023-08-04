package InheritancePgm;
import java.util.Scanner;
class Employee2
{
	int empid; 
	String ename;
	double bp;
		
	Employee2()
	{
		System.out.println("Employee ID:  "+empid);
		System.out.println("Employee Name:  "+ename);		
	}
	
}
class Payroll3 extends Employee
{
	double bp,hra,da,gp;
	Payroll3(int empid,String ename,double bp, double hra,double da)
	{
		super();		
		gp = bp +hra+da;
				
		System.out.println("Gross Salary:  "+gp);
	}
}


public class SuperConst {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int eid;
		String ename;
		double b1,hra,da;
		
		System.out.println("Enter the Employee ID:");
		eid = sc.nextInt();
		System.out.println("Enter the Employee Name:");
		ename = sc.next();
		
		System.out.println("Enter the BasicPay:");
		b1 = sc.nextDouble();
		System.out.println("Enter the HRA:");
		hra = sc.nextDouble();
		System.out.println("Enter the DA:");
		da = sc.nextDouble();
		
		Payroll3 p = new Payroll3(eid,ename,b1,hra,da);
		
	}

}
