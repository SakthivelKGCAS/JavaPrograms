package ClassandObjects;

class Student
{
	int rollno;
	String name;
	
	void getData(int r,String s)
	{
		rollno = r;
		name = s;
	}
	void display()
	{
		System.out.println("Rollno: "+rollno);
		System.out.println("Name: "+name);
	}
}


public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Student s1 = new Student(); // object creation
			
			s1.getData(1025,"Naveen");
			s1.display();
			
			//Student s2 = new Student();

			
			/*s1.rollno = 1023; // by reference initializing data to an object
			s1.name = "Naveen";
			
			s2.rollno = 1024;
			s2.name = "Kiruba";
			
			System.out.println(s1.rollno);
			System.out.println(s1.name);
			
			
			System.out.println(s2.rollno);
			System.out.println(s2.name);*/
	
	
		}

}
