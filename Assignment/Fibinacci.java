import java.util.Scanner;
public class Fibinacci{
	public static void main(String[] args){
 		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range");
		int num1=0;
		int num2=1;
		int num3;
		int range=sc.nextInt();
		System.out.print(num1+" "+num2);
		for(int i=2;i<range;i++){
			num3=num1+num2;
			System.out.print(" "+num3);
	                num1=num2;
			num2=num3;
		}
	}
}
		
