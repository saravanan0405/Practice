import java.util.Arrays;
import java.util.Scanner;
class CopyArrays
{
    public static void main(String s[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the range");
    int range=sc.nextInt();
    int arr[]=new int [range];
    System.out.println("Array elements are");
    for(int i=0;i<arr.length;i++)
    {
    arr[i]=sc.nextInt();
    }
    int b[]=new int[range];
    System.out.println("Copy array elements");
    
    for(int i=0;i<arr.length;i++){
       b[i]=arr[i];
    } 
  
    for(int i=0;i<b.length;i++){
     System.out.println(b[i]+" ");
    }
  }  
}
    
    
    
  
