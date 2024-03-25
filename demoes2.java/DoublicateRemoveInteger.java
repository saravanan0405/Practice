import java.util.Scanner;
class DoublicateRemoveInteger
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
  int j=0;
  for(int i=0;i<arr.length-1;i++){
  if(arr[i]!=arr[i+1]){
  arr[j++]=arr[i];
  }
  }
  arr[j++]=arr[arr.length-1];
  System.out.println("After removal");
  for(int k=0;k<j;k++){
  System.out.println(arr[k]);
  }
 }
}
