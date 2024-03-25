import java.util.Scanner;
class MaximumAndMinimum
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
int max=Integer.MIN_VALUE;
int min=Integer.MAX_VALUE;
System.out.println("Enter the range");
int range=sc.nextInt();
System.out.println("Enter the array elements are");
int arr[]=new int[range];
for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
}
for(int i=0;i<arr.length;i++){
if(arr[i]>max){
max=arr[i];
}
if(arr[i]<min){
min=arr[i];
}
}
System.out.println("Logest number of array="+max);
System.out.println("Smallest number of array="+min);
}
}
