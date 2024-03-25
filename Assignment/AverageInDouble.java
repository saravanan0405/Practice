import java.util.Scanner;
public class AverageInDouble{
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int range=sc.nextInt();
		double avg;
		System.out.println("Enter the array elements");
		double arr[]=new double[range];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextDouble();
		}
		double sum=0;
		for(int i=0;i<arr.length;i++){
		   	sum=sum+arr[i];
		}
		avg=sum/range;
		System.out.println("Average value array="+avg);
	}
}

		
