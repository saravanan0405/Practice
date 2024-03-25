import java.util.Scanner;
class DiffLongestAndSmallest
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
  int max=arr[0];
  int min=arr[0];
  int different=0;
  for(int i=0;i<arr.length;i++){
  if(arr[i]>max){
  max=arr[i];
  }
  else if(arr[i]<min){
  min=arr[i];
  }
  }
  different=max-min;
  System.out.println("The Differnt of Longest and smallest elements is="+different);
 }
} 
