package Constructor_Prgms;
class Student
{
	int id;
	String name;
	Student(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
		Student(Student d) // copy constructor
	{
		id = d.id;
		name = d.name;
	}
		void display()
	{
		
		System.out.println("Rollno: "+id+"\n Name: "+name);
	}
}
public class CopyConstructor {
	public static void main(String[] args) {
		
		Student s1 = new Student(1001,"Raghuram");
		Student s2 = new Student(s1);
		s1.display();
		s2.display();		
	}
}
