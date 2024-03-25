import java.util.Scanner;
class MoveZero
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
  if(range==0 || range==1){
  System.out.println("The array length less than 2");
  }
  int i=0,j=0,temp=0;
  while(i<arr.length){
  if(arr[i]!=0){
  temp=arr[i];
  arr[i]=arr[j];
  arr[j]=temp;
  i++;
  j++;
  }
  else{
  i++;
  }
  }
  System.out.println();
  for(int k=0;k<arr.length;k++){
  System.out.println(arr[k]+" ");
  }
 }
} 
