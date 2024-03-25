import java.util.Scanner;
public class Ignorestring{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		String s1="";
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch!=' '){
				s1+=ch;
			}
                        }
		String s2= "";
		for(int i=s1.length()-1;i>=0;i--){
			char ch=s1.charAt(i);
			s2+=ch;
		}
	if(s1.equals(s2)){
		System.out.println("palindrome");
	}
	else
		System.out.println("Not palindrome");
	}
}
