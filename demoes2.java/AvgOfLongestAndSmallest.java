import java.util.Scanner;
class AvgOfLongestAndSmallest
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
  int sum=0,max=0,min=0;
  for(int i=0;i<arr.length;i++){
  sum=sum+arr[i];
  if(arr[i]>max){
  max=arr[i];
  }
  else if(arr[i]<min){
  min=arr[i];
  }
  }
  int avg=(sum-(max+min))/(arr.length-2);
  System.out.println("Avg value of min and max is="+avg);
 }
}
