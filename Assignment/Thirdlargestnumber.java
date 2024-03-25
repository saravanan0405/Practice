import java.util.Scanner;
public class Thirdlargestnumber{
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
                System.out.println("Enter the range");
		int range=sc.nextInt();
		int max=Integer.MIN_VALUE;
		int secondmax=Integer.MIN_VALUE;
		int thirdmax=Integer.MIN_VALUE;
		System.out.println("Enter the value");
		int a[]=new int[range];
		for(int i=0;i<a.length;i++){
		a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++){
		 if(a[i]>max){
		         thirdmax=secondmax;
			 secondmax=max;
			 max=a[i];
		 }
		 else  if(a[i]>secondmax){
		         thirdmax=secondmax;
			 secondmax=a[i];
		 }
		 else if(a[i]>thirdmax){
			 thirdmax=a[i];
		 }
		 }
	System.out.println("Third largest number="+thirdmax);
	}
}
