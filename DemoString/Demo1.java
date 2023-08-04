package DemoString;

public class Demo1 {
public static void main(String[] args) {
	
	// immutable
	String s1 = "kgm";
	
	s1.concat("Microcollege");
	System.out.println(s1);
	
	
	
	// mutable
	StringBuffer s3 = new StringBuffer("kgm");
	s3.append("Microcollege");
	
	System.out.println(s3);
	
	//Different Objects
	
	String str1 = "Naveen";
	String str2 = str1.concat("Kumar");
	
	System.out.println(str2);
}
}
