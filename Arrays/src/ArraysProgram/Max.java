package ArraysProgram;

import java.util.Scanner;

public class Max {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int size,i,j,max,min,temp;
		
		
		System.out.println("Enter the size of an array");
		size = sc.nextInt();
		
		System.out.println("Enter Array Elements one by one");
		for(i=0;i<size;i++)
		{
		 a[i] = sc.nextInt();
		}
		
		max = a[0];
		min = a[0];
		
		for(i=0;i<size;i++)
		{
		  
			if(a[i]>max)
			{
				max = a[i];
			}
			
			if(a[i]<min)
			{
				min = a[i];
			}
					
		}
		System.out.println("Maximum Value of an Array "+max);
		System.out.println("Minimum Value of an Array "+min);
		
		System.out.println("Reverse of an Array");
		for(i=size-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		
		
		System.out.println("Array Duplication:  ");
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(a[i] == a[j])
				{
					System.out.println("Array Duplication:  "+a[j]);
				}
			}
		}
		
		
		System.out.println("Sorting an Array ");
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(a[i] > a[j])
				{
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
					
					
				}
			}
		}
		
		for(i=0;i<size;i++)
		{
		
			System.out.println(a[i]);
		}
		
		
	}

}
