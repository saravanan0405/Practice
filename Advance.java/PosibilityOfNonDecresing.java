import java.util.Scanner;
class PosibilityOfNonDecresing
{
  public static void main(String s[])
  {
  Scanner sc=new Scanner(System.in);
    System.out.println("Enter the range");
      int range=sc.nextInt();
      int arr[]=new int[range];
    System.out.println("Array elemenets are");
    
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
      }
      
      System.out.println(decreasing(arr));
      
   }
   
  public static boolean decreasing(int [] arr){
  
  int count=0;
  
  for(int i=1;i<arr.length;i++)
  {
      if(arr[i]<arr[i-1])
      {
      count++;
     
      if(count>1){
      return false;
      }
      if(i>=2 && arr[i]<arr[i-2]){
           arr[i]=arr[i-1];
        }
      else{
           arr[i-1]=arr[i];  
       }
       }
       }
       return true;
       
     }
 }
