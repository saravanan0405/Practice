import java.util.*;
class MergeOverLapping
{
   public static void mergeoverlapping(int [][] array)
   {

    for (int i = 1; i < array.length; i++) {
                if (array[i][0] < array[i - 1][0]) {
                   
                    int[] temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
              for(int[] ans : array){
                 System.out.println(Arrays.toString(ans));
              	}
              	
              
              
           int currentstart=array[0][0];
           int currentend=array[0][1];
           for(int i=1;i<array.length;i++){
           int start=array[i][0];
           int end=array[i][1];
           if(start<=currentend){
           currentend=Math.max(end,currentend);
          }
          else
          {
          System.out.println(" "+currentstart+" "+currentend+" ");
          currentstart=start;
          currentend=end;
          }
         }
          System.out.println(" "+currentstart+" "+currentend+" ");
     }
  public static void main(String[] args)
  {
        int arr[][]={{1,3},{4,8},{2,7},{5,11},{17,19},{18,24}};
       mergeoverlapping(arr);
          
        }
}

