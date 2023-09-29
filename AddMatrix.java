import java.util.Scanner;
class AddMatrix
{
	public static void main(String args[])
	{
		int col, row;
		Scanner sc= new Scanner(System.in);
		System.out.println("entr row&col");
		row= sc.nextInt();
		col=sc.nextInt();
		int a[][]= new int[row][col];
		int b[][]=new int[row][col];
		int sum[][]=new int [row][col];
		System.out.println ("enter 1st matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			
		    }
		}
		System.out.println ("enter 2st matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				b[i][j]=sc.nextInt();
			
		    }
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
			
		    }
		}
		System.out.println ("sum is");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(" " +sum[i][j]);
			
		    }
			System.out.println ("  ");
		}
		
	}

}