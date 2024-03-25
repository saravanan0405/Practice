import java.util.Arrays;
import java.util.Scanner;
class Insert 
{
    public static void main(String[] args) 
    {
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of an array:");
           int len = sc.nextInt();
        int arr[] = new int[len+1];
        System.out.println("Array elements are:");
        for(int i = 0; i < len; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the position where you want to insert an element:");
        int position = sc.nextInt();
        System.out.print("Enter the element which you want to insert:");
        int elements = sc.nextInt();
        for(int i = len-1; i >= (position-1); i--)
        {
            arr[i+1] = arr[i];
        }
        arr[position - 1] = elements;
        System.out.print("After inserting : ");
        for(int i = 0; i <=len; i++)
        {
            System.out.println(arr[i]+" ");
        }
      
    }
}
