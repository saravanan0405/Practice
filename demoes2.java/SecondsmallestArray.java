import java.util.Scanner;
class SecondsmallestArray
{	
     public static void main(String s[])
  {
	  Scanner sc=new Scanner(System.in);
	  int small=Integer.MAX_VALUE;
	  int secondsmall=Integer.MAX_VALUE;
	  System.out.println("Enter the range");
	  int range=sc.nextInt();
	  int arr[]=new int[range];
	  System.out.println("Array elements are");
	  for(int i=0;i<arr.length;i++)
	  {
		  arr[i]=sc.nextInt();
	  }
	  for(int i=0;i<arr.length;i++)
	  {
		  if(arr[i]<small){
			  secondsmall=small;
			  small=arr[i];
		  }
		 else if(arr[i]<secondsmall){
			  secondsmall=arr[i];
		  }
	  }
	 System.out.println("Second Smallest Array elements is="+secondsmall);
  }
}
			  
		  
	
   

