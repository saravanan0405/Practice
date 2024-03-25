import java.util.Scanner;
public class ReverseString{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Before reverse");
		String s=sc.nextLine();
		char [] s2=s.toCharArray();
		for(int i=s2.length-1;i>=0;i--){
			System.out.print("After reverse="s2[i]);
		}
	}
}
