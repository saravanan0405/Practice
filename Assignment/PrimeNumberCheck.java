import java.util.Scanner;

public class PrimeNumberCheck
{
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the number");
	int number = in.nextInt();
	
	
	System.out.println(isPrimeNumber(number));
	}
	static boolean isPrimeNumber(int number){
	    return helper(number , number - 1);
	}
	
	static boolean helper(int n, int divisor)
	{
	    if(n < 2){
	        return false;
	    }
	    
	    if(divisor == 1){
	        return true;
	    }
	    if(n % divisor == 0){
	        return false;
	    }
	    return helper(n, divisor - 1);
	}
}
