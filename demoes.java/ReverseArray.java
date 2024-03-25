import java.util.Arrays;
import java.util.Scanner;
class ReverseArray
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the range");
int range=sc.nextInt();
int arr[]=new int[range];
System.out.println("Enter the array elements");
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
int i=0,j=arr.length-1;
while(i<=j){
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
i++;
j--;
}
System.out.println("After reverse array");
for(int k=0;k<arr.length;k++){
System.out.println(arr[k]);
}
}
}
