
import java.util.Scanner;

public class LcmLooping{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Number");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int lcm=(n1>n2)?n1:n2;
		while(true) {
			if(lcm%n1==0 && lcm%n2==0) {
				System.out.println(lcm);
			break;
			}
			++lcm;
		}

	}

}