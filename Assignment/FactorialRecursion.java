import java.util.*;
public class FactorialRecursion
{
       static int fact(int no){
		if(no==0)
			return 1;
		return no*fact(no-1);
	}
    public static void main(String s[])
{
       Scanner sc=new Scanner(System.in);
	   System.out.println("Enter factorial range");
	   int no=sc.nextInt();
	   System.out.println();
	   System.out.println("factorial rang is="+fact(no));
}
}
