import java.util.Scanner;
class SumOfArray
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the range");
int range=sc.nextInt();
int arr[]=new int[range];
System.out.println("Array Elements are");
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
int sum=0;
for(int i=0;i<arr.length;i++)
{
sum=sum+arr[i];
}
System.out.println("Sum value of array="+sum);
}
}

