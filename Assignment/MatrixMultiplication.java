import java.util.*;
public class MatrixMultiplication
{
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of row in first matrix");	   
	    int row1=sc.nextInt();
        System.out.println("Enter number of col in first matrix");	   
        int col1=sc.nextInt();
		System.out.println("Enter number of row in second matrix");	   
        int row2=sc.nextInt();
		System.out.println("Enter number of col in second matrix");	   
        int col2=sc.nextInt();
		if(col1!=row2)
		{
			System.out.println("The matrix is not multipical");
		}
		else
			{
			int a[][]=new int[row1][col1];
			int b[][]=new int[row2][col2];
			int c[][]=new int[row1][col2];
			System.out.println("Enter value for first matrix ");
			for(int i=0;i<row1;i++)
			{
				for(int j=0;j<col1;j++)
				{
				a[i][j]=sc.nextInt();
			}
			}
			System.out.println("Enter value for second matrix");
			for(int i=0;i<row2;i++)
			{
				for(int j=0;j<col2;j++)
				{
					b[i][j]=sc.nextInt();
				}
			}
			System.out.println("Matrix Multiplication");
			for(int i=0;i<row1;i++)
			{
				for(int j=0;j<col2;j++)
				{
					c[i][j]=0;
					for(int k=0;k<col1;k++)
					{
						c[i][j]=c[i][j]+a[i][k]*b[k][j];
					}
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
			}
	}
}