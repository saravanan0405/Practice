import java.util.Scanner;
class ContaineTwoElement
{
  public static void main(String s[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the range");
  int range=sc.nextInt();
  int arr[]=new int[range];
  System.out.println("Array elements are");
  for(int i=0;i<arr.length;i++){
  arr[i]=sc.nextInt();
  }
  System.out.println("Enter two elements");
  int elements1=sc.nextInt();
  int elements2=sc.nextInt();
  boolean flag1=false;
  boolean flag2=false;
  for(int i=0;i<arr.length;i++){
  if(arr[i]==elements1){
  flag1=true;
  }
  else if(arr[i]==elements2){
  flag2=true;
  }
  }
  if(flag1 && flag2){
  System.out.println("The array elements contains the two value");
  }
  else
  System.out.println("Array value not contains the two value");
 }
}
