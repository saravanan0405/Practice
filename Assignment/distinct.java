import java.util.Arrays;
import java.util.Scanner;
public class distinct{
       public static void main(String arg[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter range");
       int range=sc.nextInt();
       int arr[]=new int[range];
       int[] result=new int[range];
       System.out.println("Enter the elements");
       for(int i=0;i<arr.length;i++){
	      arr[i]=sc.nextInt();
       }
       
       int count=0;
       for(int i=0;i<arr.length;i++){
       	boolean flag=true;
	      for(int j=0;j<arr.length;j++){
		    if(i!=j && arr[i]==arr[j]){
			    flag=false;
		     }
	      }
	      if(flag){
	       result[count++]=arr[i];
	      }
       }
	      System.out.println(Arrays.toString(Arrays.copyOf(result,count)));
       }
}

