import java.util.Scanner;
class RotateCount
{
  public static void main(String s[])
  {
  Scanner sc=new Scanner(System.in);
  int max=Integer.MIN_VALUE;
  System.out.println("Enter the range");
  int range=sc.nextInt();
  int arr[]=new int[range];
  System.out.println("Array elements are");
  for(int i=0;i<arr.length;i++){
  arr[i]=sc.nextInt();
  }
  int index = 0;
  for(int i=0;i<arr.length;i++){
  if(arr[i]>max){
  max=arr[i];
  index = i;
  
  }
  }if(index + 1 != arr.length){
  System.out.println("Rotate count of"+(index + 1));
 }else{
 System.out.println("Rotate count of"+0);
 }
}
}
