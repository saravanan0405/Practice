import java.util.Scanner;
class CheckZeroAndOne
{
  public static void main(String s[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the range");
  int range=sc.nextInt();
  System.out.println("Array elements are");
  int arr[]=new int[range];
  for(int i=0;i<arr.length;i++){
  arr[i]=sc.nextInt();
  }
  boolean flag=false;
  for(int i=0;i<arr.length;i++){
  if(arr[i]==0 || arr[i]==-1){
  flag=true;
  break;
  }
  }
  if(flag==false){
  System.out.println("with out 0 and -1 in array elements");
  }
  else
  System.out.println("With 0 and -1 present in array elements");
 }
}
  
