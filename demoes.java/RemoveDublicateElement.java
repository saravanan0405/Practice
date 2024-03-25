import java.util.Scanner;
class RemoveDublicateElement
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array length");
int range=sc.nextInt();
int []arr=new int[range];
for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
}

boolean [] isdublicate=new boolean[range];

for(int i=0;i<range-1;i++)
{
	if(!isdublicate[i]){
	
	boolean visited=false;
	for(int j=i+1;j<range;j++)
	{
	if(arr[i]==arr[j]){
	  visited=true;
	 isdublicate[j] = true;
	
	  }
	  }

if(visited){
  System.out.println(arr[i]+" ");
     }
  
    }
   } 
}
}
	  
