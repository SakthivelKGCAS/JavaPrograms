package DemoString;

public class Equals {
public static void main(String[] args) {
	
	String s4 = "Java";
	String s5 = "Java";
	String s6 = "jAVA";
	
	System.out.println("equals method");
	System.out.println(s4.equals(s5));
	System.out.println(s4.equals(s6));
	System.out.println(s4.equalsIgnoreCase(s6));
	
	// == Memory Reference
	
	String s7 = "Dhoni";
	String s8 = "Dhoni";
	
	
	String s9 = new String("Dhoni");
	
	System.out.println("== method");
	System.out.println(s7==s8);
	System.out.println(s7==s9);
	
	
	String s10 = "A";
	String s11 = "A";
	String s12 = "a";
	String s13 = "C";
	
	System.out.println("compareTo method");
	System.out.println(s10.compareTo(s11));
	System.out.println(s10.compareTo(s12));
	System.out.println(s13.compareTo(s10));
	
	
	// Concatenation
	
	System.out.println("Concatenation");
	
	String s14 = "Java"+"Programming";
	System.out.println(s14);
	
	String s15 = "Arun";
	String s16 = " Raj";
	
	System.out.println(s15.concat(s16));
	
	//Append()
	System.out.println("Append");
	StringBuilder s17 = new StringBuilder("Kiruba");
	System.out.println(s17.append("garan"));
	
	//format
	System.out.println("format");
	
	String s18 = new String("Naveen");
	String s19 = new String("Full Stack Developer");
	String s20 = String.format("%s%s",s18,s19);
	System.out.println(s20.toString());
	
	//Replace
		System.out.println("Replace");
		String s21 = "Java Programming";
		System.out.println(s21.replace('r', 'R'));
		
	// Substring
		
		System.out.println(s21.substring(5));
		System.out.println(s21.substring(0,4));
		
		
		
		
	
	
	
}
}
