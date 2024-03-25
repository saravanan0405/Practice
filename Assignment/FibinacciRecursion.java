import java.util.Scanner;
public class FibinacciRecursion
{
	static int no1=0,no2=1,no3;
	static void printfibinacci(int count){
	if(count>0){
         no3=no1+no2;
		 no1=no2;
		 no2=no3;
		 System.out.print(" "+no3);
		 printfibinacci(count-1);
	}
	}
  public static void main(String s[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Fibinacci range");
	int count=sc.nextInt();
	System.out.print(no1+" "+no2);
	printfibinacci(count-2);
}
}

 
