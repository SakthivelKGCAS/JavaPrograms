package ControlStatement;
import java.util.*;

public class Nested {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String un,pw;
		
		System.out.println("Enter the Username");
		un = sc.nextLine();
		System.out.println("Enter the Password");
		pw = sc.nextLine();
		
		if(un.equals("kgm"))
		{
			if(pw.equals("kgm@123"))
			{
				System.out.println("Valid User");
			}
			else
			{
				System.out.println("InValid Password");
			}
		}
		else
		{
			System.out.println("Invalid Username");
		}

	}

}
