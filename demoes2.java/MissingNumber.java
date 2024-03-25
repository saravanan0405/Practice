import java.util.Scanner;
class MissingNumber
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the range");
  int range=sc.nextInt();
  int arr[]=new int[range];
  int length=arr.length;
  System.out.println("Array elements are");
  for(int i=0;i<arr.length;i++)
  {
  arr[i]=sc.nextInt();
  }
  int sum=0;
  for(int i=0;i<arr.length;i++){
  sum=sum+arr[i];
  }
  System.out.println("sum of array="+sum);
  int sum1=0;
  for(int i=1;i<=length+1;i++){
	  sum1=sum1+i;
  }
  System.out.println("sum of length="+sum1);
  System.out.println("Missing number is="+(sum1-sum));
 }
}
