import java.util.Scanner;
class SecondLongestElement
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
int max=Integer.MIN_VALUE;
int secondmax=Integer.MIN_VALUE;
System.out.println("Enter the range");
int range=sc.nextInt();
int arr[]=new int[range];
System.out.println("Array elements are");
for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
}
for(int i=0;i<arr.length;i++){
if(arr[i]>max){
secondmax=max;
max=arr[i];
}
else if(arr[i]>secondmax){
secondmax=arr[i];
}
}
System.out.println("Second max value  is="+secondmax);
}
}


