import java.util.Scanner;
public class Fahrenheit{
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Entet the Celsius value");
		float C=sc.nextFloat();
		double F=(C*9/5)+32;
		System.out.println(F);
	}
}
