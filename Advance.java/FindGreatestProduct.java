import java.util.Scanner;
class FindGreatestProduct
{
  public static void main(String s[])
  {
    Scanner sc=new Scanner(System.in);
      System.out.println("Enter range");
        int range=sc.nextInt();
        int arr[]=new int[range];
      System.out.println("Enter array elements are");
        for(int i=0;i<arr.length;i++)
        {
           arr[i]=sc.nextInt();
           }
           
           if(arr.length<3){
           System.out.println("array length less then 3");
           }
           int max1=Integer.MIN_VALUE;
           int max2=Integer.MIN_VALUE;
           int max3=Integer.MIN_VALUE;
           
           int min1=Integer.MAX_VALUE;
           int min2=Integer.MAX_VALUE;
           
           for(int i=0;i<arr.length;i++)
           {
            if(arr[i]>max1){
              max3=max2;
              max2=max1;
              max1=arr[i];
            }
             else if(arr[i]>max2){
               max3=max2;
               max2=arr[i];
               }
              else{
              max3=arr[i];
              }
               
             if(arr[i]<min1){
             min2=min1;
             min1=arr[i];
             } 
             else if(arr[i]<min2){
             min2=arr[i];
             }
             }
             int  product1=(min1 * min2 * max1);
             int  product2=(max1 * max2 * max3);
             if(product1 > product2){
             System.out.println("max product="+product1);
             }
             else
             System.out.println("max product="+product2);
     }
  }        
           
       
    
