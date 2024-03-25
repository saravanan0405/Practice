import java.util.Scanner;
public class Average{
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int num=sc.nextInt();
		System.out.println("Enter "+num+" values");
		int a[]=new int[num];
		for(int i=0;i<num;i++){
			a[i]=sc.nextInt();
		}
		int sum=0;
	       for(int j=0;j<a.length;j++){
		       sum=sum+a[j];
	       }
	       int avg=sum/a.length;
	       System.out.println("The avg value is= "+avg);
	}
}




		      

