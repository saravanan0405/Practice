import java.util.Scanner;
class BinnerySearch
{
  public static void main(String s[])
  {
    
    System.out.println(Binnery());
    }
  
  public static int Binnery(){
    Scanner sc=new Scanner(System.in);
     
         int range=sc.nextInt();
         int arr[]=new int[range];
      System.out.println("Array elements are");
         for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
             }
         System.out.println("Enter target value");
         int target=sc.nextInt();
         
         int temp=0;
           for(int i=0;i<arr.length;i++)
           {  
             for(int j=1;j<arr.length;j++)
             {
               if(arr[j] < arr[j-1]){
                temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                }
             }
             
            
            }
                         
          int start=0;
          int end=arr.length-1;
             while(start<=end)
             { 
               int mid=start+(end - start)/2;
                if(arr[mid]<target){
                 start=mid+1;
               }
                else if(arr[mid]>target){
                end = mid - 1;
                }
                
                else{
            
                return mid;
                }
            }
            return -1;
        }
      
 }                
