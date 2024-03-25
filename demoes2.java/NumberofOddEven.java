import java.util.Scanner;
class NumberofOddEven
{
   public static void main(String s[])
   {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the range");
   int range=sc.nextInt();
   int arr[]=new int[range];
   System.out.println("Array elements are");
   for(int i=0;i<arr.length;i++)
   {
   arr[i]=sc.nextInt();
   }
   int oddnum=0;
   int evennum=0;
   for(int i=0;i<arr.length;i++){
   if(arr[i]%2==0){
   evennum++;
   }
   else
   oddnum++;
   }
   System.out.println("Odd Number of array elements="+oddnum);
   System.out.println("Even Number of array elements="+evennum);
  }
}