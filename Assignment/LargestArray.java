import java.util.Scanner;
public class LargestArray{
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int range=sc.nextInt();
		int max=Integer.MIN_VALUE;
		int arr[]=new int[range];
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println("Maximum elements of array="+max);
	}
}
