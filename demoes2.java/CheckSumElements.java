import java.util.Scanner;
class CheckSumElements
{
  public static void main(String s[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the range");
  int range=sc.nextInt();
  int arr[]=new int[range];
  System.out.println("Array Elements are");
  for(int i=0;i<arr.length;i++){
  arr[i]=sc.nextInt();
  }
  System.out.println(check(arr));
  }
  static boolean check(int arr[]){
  int value=30;
  int element=10;
  int temp=0;
  for(int i=0;i<arr.length;i++){
  if(arr[i]==element){
  temp+=element;
  }
  }
  if(temp==value){
   return true;
 }
    return false;
   }

}
