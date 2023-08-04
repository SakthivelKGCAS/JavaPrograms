package ControlStatement;
import java.util.*;
public class Switch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char ch;
		
		System.out.println("Entre the First Character of the Days");
		ch = sc.next().charAt(0);
		switch(ch)
		{
		case 's':
		case 'S':
				System.out.println("Sunday");
				break;
		case 'm':
		case 'M':
				System.out.println("Monday");
				break;	
		case 't':
		case 'T':
				System.out.println("Tuesday");
				break;
		default:
			System.out.println("Enter only S,s,m,M,t,T");
			break;
		}
		
		
	}

}
