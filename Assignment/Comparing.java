import java.util.Scanner;
public class Comparing{
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 Number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		if(num1>num2){
			System.out.println("num1 is greater than num2");
		}
		else if(num1<num2){
			System.out.println("num1 is lesser than num2");
		}
		else 
			System.out.println("both are equals");
		
	}
}
