import java.util.Scanner;
public class SumofArray{
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length");
		int range=sc.nextInt();
		int arr[]=new int[range];
		int sum=0;
		System.out.println("Enter value");
		for(int i=0;i<arr.length;i++){
                  arr[i]=sc.nextInt();
	          sum=sum+arr[i];
		}
		System.out.println("The sum of array value="+sum);
	}
}
		
