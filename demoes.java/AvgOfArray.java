import java.util.Scanner;
class AvgOfArray
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
int avg=arr.length;
int total=0;
for(int i=0;i<arr.length;i++)
{
total=arr[i]+total;
}
avg=total/avg;
System.out.println("Avg value of array="+avg);
}
}

