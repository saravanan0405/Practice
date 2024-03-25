import java.util.Scanner;
class LongestConsective
{
  public static void main(String s[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the range");
  int range=sc.nextInt();
  System.out.println("Enter the array elements are");
  int arr[]=new int[range];
  for(int i=0;i<arr.length;i++){
  arr[i]=sc.nextInt();
  }
  if(arr.length==0){
	  System.out.println("Length of Longest Consective is 0");
  }
  int temp=0;
  for(int i=0;i<arr.length;i++){
  for(int j=1;j<arr.length;j++){
  if(arr[j]<arr[j-1]){
  temp=arr[j];
  arr[j]=arr[j-1];
  arr[j-1]=temp;
  }
  }
  }
 
  int len=arr.length;
  int currentlength=1;
  int maxlength=1;
  for(int i=0;i<len-1;i++)
  {
	  if(arr[i]==arr[i+1]){
		  continue;
	  }
	  else if(arr[i]+1==arr[i+1]){
		  currentlength++;
	  }
	  else{
		  if(currentlength>maxlength){
			  maxlength=currentlength;
		  }
		  currentlength=1;
	  }
  }
if(currentlength>maxlength){
maxlength=currentlength;
}
System.out.println("Longset Consective is="+maxlength);
  }
} 
