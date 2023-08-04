package ArraysProgram;
import java.util.*;

public class RunTimeArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n[] = new int[10];
		int size,i,j,sum,avg;
		sum=0;
		
		System.out.println("Enter the size of an array");
		size = sc.nextInt();
		
		System.out.println("Enter Array Elements one by one");
		for(i=0;i<size;i++)
		{
		 n[i] = sc.nextInt();
		}
		
		
		for(i=0;i<size;i++)
		{
			System.out.println("Index:  "+i+"  Array Value:  "+n[i]);
		 sum = sum+n[i];
		}
		
		
		avg = sum/size;
		
		System.out.println("Sum : "+sum);
		System.out.println("Sum : "+avg);
		
		
		int a[] = {2,3,4,5,5,6,7,8};
		// Duplication
		
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicated Elements"+a[j]);
				}
					
			}
		}


	}

}
