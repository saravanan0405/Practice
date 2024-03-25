import java.util.Scanner;
class Dublicatecharacter
{
	public static void main(String args[])
	{
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the string");
	
	String s=sc.nextLine();
	
	int range=s.length();
	boolean dublicate[]=new boolean[range];
	
	boolean visited=false;
	
	char c[]=s.toCharArray();
	
	for(int i=0;i<s.length();i++)
	{

	 if(!dublicate[i]){
	 
	for(int j=0;j<s.length();j++)
	{
	  if( i !=j && c[i]==c[j]) {   
	       visited=true;
	       dublicate[j]=true;
	     }
	     } 
	     if(!dublicate[i]){
	     System.out.print(c[i]+" ");
	     }
	    }
	   }
    }
}
	    
	     
	  
	     
	     
	
