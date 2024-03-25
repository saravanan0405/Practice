import java.util.Scanner;
class IndexOfArray
{
   public static void main(String args[])
   {
        Scanner sc=new Scanner(System.in);
          System.out.println("Enter the array range");
               int range=sc.nextInt();
               System.out.println("Key value");
               int key=sc.nextInt();
               
               int arr[]=new int[range];
               System.out.println("Enter the array elemnts are");
               
                      for(int i=0;i<arr.length;i++)
                      {
                         arr[i]=sc.nextInt();
                         }
                         
                         for(int i=0;i<arr.length;i++){
                         if(arr[i]==key){
                         	System.out.println(arr[i]+"present in "+i+" position");
                         	break;
                         }else if(i == arr.length - 1){
                         	System.out.println("Key Not Found");
                         
              		}
              		
              	}	
     }
 }
                         
                         
