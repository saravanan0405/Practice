import java.util.Arrays;
import java.util.Scanner;
class RemoveValue
{
  public static void main(String args[])
  {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter array range");
                  int range=sc.nextInt();
                  int arr[]=new int[range];
           System.out.println("Before Array elements are");
                  for(int i=0;i<arr.length;i++)
                {
                      arr[i]=sc.nextInt();
                      }
                 System.out.println("Remove elements");
                  int remove=sc.nextInt();
                  int index=0;
                  for(int i=0;i<arr.length;i++)
                  {
                  if(remove==arr[i]){
                  index=i;
                  }
                  }
                  for(int i=index;i<arr.length-1;i++)
                  {
                  arr[i]=arr[i+1];
                  }
                  arr = Arrays.copyOf(arr,arr.length-1);
                  System.out.println(Arrays.toString(arr));      
      }                     


}

