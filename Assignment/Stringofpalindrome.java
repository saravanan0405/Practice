import java.util.Scanner;
public class Stringofpalindrome{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String s=sc.nextLine();
	String reverse="";
	for(int i=s.length()-1;i>=0;i--){
	char ch=s.charAt(i);
	reverse=reverse+ch;
	}
	System.out.println("Reverse string="+reverse);
	if(reverse.equals(s)){
        System.out.println("The String is palindrome");
        }
        else
        System.out.println("The String is not palindrome");
   }
	
}
