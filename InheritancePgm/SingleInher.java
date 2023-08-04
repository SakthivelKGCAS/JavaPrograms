package InheritancePgm;

 class EmployeeDetails {
	int empno = 1056;
	String ename = "Rajasekar";

}
 class Payroll extends EmployeeDetails
 {
	 double bp = 30569.90;
 }
 class SingleInher
{
	public static void main(String[] args) {
		
		Payroll obj1 = new Payroll();
		
		
		System.out.println("Employee ID:  "+obj1.empno);
		System.out.println("Employee Name:  "+obj1.ename);
		System.out.println("Basic Pay:  "+obj1.bp);
		
	}
}