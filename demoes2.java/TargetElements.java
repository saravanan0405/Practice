import java.util.Scanner;
class TargetElements
{
   public static void main(String args[])
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
   System.out.println("Enter target value");
   int target=sc.nextInt();
   int sum=0;
   for(int i=0;i<arr.length-1;i++)
   {
   for(int j=i+1;j<arr.length;j++)
   {
   sum=arr[i]+arr[j];
   if(target==sum)
   System.out.println(" "+arr[i]+" "+arr[j]);
   }
 }
}
}