import java.util.Arrays;
import java.util.Scanner;
class ascending
{
	public static void main(String s[])
{
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the array length");
     int range=sc.nextInt();
     int arr[]=new int[range];
     for(int i=0;i<arr.length;i++){
	     arr[i]=sc.nextInt();
     }
     dscending(arr);
     int result[]=new int[range];
     int count=0;
     for(int i=0;i<arr.length;i++){
	     if(arr[i]%2!=0){
		     result[count++]=arr[i];
	     }
     }
     for(int i=arr.length-1;i>=0;i--){
	     if(arr[i]%2==0){
		     result[count++]=arr[i];
	     }
     }
     System.out.println(Arrays.toString(result));
}

     static int [] dscending(int arr[]){
	     for(int i=0;i<arr.length;i++){
		     for(int j=1;j<arr.length;j++){
			    if(arr[j] > arr[j-1]){
				    int temp=arr[j];
				    arr[j]=arr[j-1];
				    arr[j-1]=temp;
			    }
		     }
	     }
			    return arr;
		     }
}
	   
