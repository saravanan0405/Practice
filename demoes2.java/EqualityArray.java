import java.util.Scanner;
class EqualityArray
{
  public static void main(String s[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the range");
  int range=sc.nextInt();
  int arr[]=new int[range];
  int arr1[]=new int[range];
  System.out.println("first array elements are");
  for(int i=0;i<arr.length;i++)
  {
  arr[i]=sc.nextInt();
  }
  System.out.println("second array elements are");
  for(int i=0;i<arr1.length;i++)
  {
  arr1[i]=sc.nextInt();
  }
  boolean isEqual=true;
if(arr.length==arr1.length)
{

	for(int i=0;i<range;i++)
	{
		if(arr[i]!=arr1[i]){
			isEqual=false;
		}
	}
}
if(isEqual==true){
	System.out.println("Array are equals");
 }
 else{
	 System.out.println("Arrays are not equals");
 }
}
}
