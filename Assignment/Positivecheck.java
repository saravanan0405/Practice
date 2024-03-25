import java.util.Scanner;
public class Positivecheck{
public static void main(String s[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	if(num>0){
		System.out.println("Positive number");
	}
	else if(num<0){
		System.out.println("Negative number");
	}
	else
		System.out.println("The Enter num is zero ");
}
}
