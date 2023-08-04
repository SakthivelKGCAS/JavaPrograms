package InheritancePgm;
import java.util.*;
class Employee
{
	int empid; 
	String ename;
	double bp;
	
	void getData(int empid,String ename,double bp)
	{
		this.empid = empid;
		this.ename= ename;
		this.bp = bp;	
		
	}
	void display()
	{
		System.out.println("Employee ID:  "+empid);
		System.out.println("Employee Name:  "+ename);
		System.out.println("Basic Pay:  "+bp);
	}
	
}
class Payroll2 extends Employee
{
	double hra,da,gp;
	void grossPay(double hra,double da)
	{
				
		gp = super.bp+hra+da;
		super.display();		
		System.out.println("Gross Salary:  "+gp);
	}
}

public class UsingSuperKeyword {
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
		
		
		Payroll2 p = new Payroll2();
		p.getData(eid,ename,b1);
		p.grossPay(hra,da);
	}

}
