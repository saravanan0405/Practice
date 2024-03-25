import java.util.Scanner;
public class Agecheck{
	public static void main(String s[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the age");
	int age=sc.nextInt();
	if(age>=18){
		System.out.println("You are an adult");
	}
	else
		System.out.println("You are not yet an adult");
	}
}

