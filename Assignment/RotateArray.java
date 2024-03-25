import java.util.Scanner;
public class RotateArray
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array range");
int range=sc.nextInt();
int arr[]=new int[range];
System.out.println("Before rotate");
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("Enter Rotate range");
int n=sc.nextInt();
System.out.println("After rotate");
for(int i=0;i<n;i++)
{
	int temp=arr[arr.length-1];
	for(int j=arr.length-1;j>0;j--)
	{
		arr[j]=arr[j-1];
	}
	    arr[0]=temp;
}
for(int i=0;i<arr.length;i++){
	System.out.print(arr[i]);
}
    System.out.println();
}
}
