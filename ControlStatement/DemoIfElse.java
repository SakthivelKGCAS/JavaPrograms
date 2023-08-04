package ControlStatement;

import java.util.*;
public class DemoIfElse {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.println("Enter any Number");
	n = sc.nextInt();
	
	if(n>=18)
	{
		System.out.println("Eligible for Voting");
	}
	else
	{
		System.out.println("Not Eligible for Voting");
	}
}
}
