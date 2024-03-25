import java.util.Scanner;
public class Guessnum{
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		if(num>=1 && num<= 50){
			System.out.println("The number is in the lower half");
		}
		else if(num>=51 && num<=100){
			System.out.println("The number is in the upper half");
		}
		else
			System.out.println("Invalid Number");
	}
}
