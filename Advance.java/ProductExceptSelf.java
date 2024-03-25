import java.util.Arrays;
import java.util.Scanner;
class ProductExceptSelf
{
  public static void main(String s[])
  {
  
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter range");
      int range=sc.nextInt();
      int arr[]=new int[range];
      System.out.println("Array Elements are");
      for(int i=0;i<arr.length;i++)
      {
        arr[i]=sc.nextInt();
        }
        
        int result[]=productexcept(arr);
        
        System.out.println(Arrays.toString(result));
        
     
     }
       public static int []  productexcept(int num[])
        {
        
        int n=num.length;
        
        int result[]=new int[n];
        
           int leftproduct=1;
               for(int i=0;i<n;i++)
               {
                  result[i]=leftproduct;
                  leftproduct=leftproduct*num[i];
                  }
                  
             int rightproduct=1;
                 for(int i=n-1;i>=0;i--)
                 {
                    result[i]*=rightproduct;
                    rightproduct=rightproduct*num[i];
                    }
                    
                    
                    return result;
                    }
  }
    
                         
        
