public class DimondPattern{
        public static void main(String s[]){
       
       int val=5;
       for(int row=1;row<=5;row++)
       {
       	for(int col=1;col<val;col++)
       	{
       	
       	System.out.print(" "+" ");
       	}
       	val--;
       	for(int col2=1;col2<=row;col2++)
       	{
       	 System.out.print("*");
       	 }
       System.out.println();
       
       }
       
       
      }
 }
