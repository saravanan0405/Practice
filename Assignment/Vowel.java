import java.util.Scanner;
public class Vowel{
	public static void main(String args[]){
      	Scanner sc=new Scanner(System.in);
	boolean result=false;
	System.out.println("Enter the String");
	String s=sc.nextLine();
	for(int i=0;i<s.length();i++){
		char ch=s.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                result=true;
		break;
		}
	}
	if(result==true){
		System.out.println("The string contains vowels");
	}
	else
		System.out.println("The string doesn't contains vowels");
	}
}
