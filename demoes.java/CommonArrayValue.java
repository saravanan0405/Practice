import java.util.Arrays;
import java.util.Scanner;
class CommonArrayValue
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the range");
int range=sc.nextInt();
System.out.println(" first array elements are");
int arr[]=new int[range];
for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
}
System.out.println("second array elements are");
int arr1[]=new int[range];
for(int i=0;i<arr1.length;i++){
arr1[i]=sc.nextInt();
}
int elements []=new int[range];
int count=0;
for(int i=0;i<arr.length;i++){
for(int j=0;j<arr1.length;j++){
if(arr[i]==arr1[j]){
elements[count++]=arr[i];
}
}
}
System.out.println("Common elements are="+Arrays.toString(Arrays.copyOf(elements,count)));
}
}
