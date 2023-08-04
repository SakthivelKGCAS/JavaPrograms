package ArraysProgram;

public class TwoDimensional {
	public static void main(String[] args) {
		
		int a1[][] = { {2,3},{4,5}};
		int a2[][] = { {4,6},{2,8}};
		int a3[][] = new int[2][2];
		
		int rows,cols;
		System.out.println("First Matrix");
		for(rows=0;rows<a1.length;rows++)
		{
			for(cols=0;cols<a1.length;cols++)
			{
				System.out.print(a1[rows][cols]+" ");
			}
			
			System.out.println();
		}
		System.out.println("Second Matrix");
		for(rows=0;rows<a2.length;rows++)
		{
			for(cols=0;cols<a2.length;cols++)
			{
				System.out.print(a2[rows][cols]+" ");
			}
			
			System.out.println();
		}
		System.out.println("Sum of Matrix");
		for(rows=0;rows<a1.length;rows++)
		{
			for(cols=0;cols<a1.length;cols++)
			{
				a3[rows][cols] = a1[rows][cols]+a2[rows][cols];
				System.out.print(a3[rows][cols]+" ");
			}
			
			System.out.println();
		}
	}

}
