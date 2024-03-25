import java.util.Scanner;
class ArraysContains
{
   public static void main(String s[])
  {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the array range");
               int range=sc.nextInt();
               int arr[]=new int [range];
               System.out.println("Target value");
                         int target=sc.nextInt();
               System.out.println("Array elements are");
                  for(int i=0;i<arr.length;i++)
           {
                    arr[i]=sc.nextInt();
                    
           }
                     for(int i=0;i<arr.length;i++)
                 {
                        if(arr[i]==target){
                        System.out.println("target value is contain");
                        break;
                   }
                        else{
                        if(i==arr.length-1){
                         System.out.println("value Not contain");
                          }
                     }
                }
    }
}

