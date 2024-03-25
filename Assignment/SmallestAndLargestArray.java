import java.util.Scanner;
public class SmallestAndLargestArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int range=sc.nextInt();
		System.out.println("Enter the array value");
		int a[]=new int[range];
		for(int i=0;i<range;i++){
	        a[i]=sc.nextInt();
	        }
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
	        for(int i=0;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}
			if(a[i]<min){
				min=a[i];
			}
		}
		System.out.println("Maximum value in array="+max);
		System.out.println("Minimum value in array="+min);
	}
}
