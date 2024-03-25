import java.util.Scanner;
public class Multiplication{
	public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int multiple;
        System.out.println("Enter the num");
        int num=sc.nextInt();
        System.out.println("table are");
	for(int i=1;i<=10;i++){
	  multiple=i*num;
	  System.out.println(i+" X "+num+" = "+multiple);
	}
	}
}


