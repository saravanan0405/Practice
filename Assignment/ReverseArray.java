import java.util.Scanner;
public class ReverseArray{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String length");
	int range=sc.nextInt();
	System.out.println("Enter the string");
	String s[]=new String[range];
	String s2[]=new String[range];
	sc.nextLine();
	System.out.println("Before reverse string");
	for(int i=0;i<s.length;i++){
            s[i]=sc.nextLine();
	}
	int index=0;
	for(int i=s.length-1;i>=0;i--){
		s2[index++]=s[i];
	}
	System.out.println("After reverse string");
	for(int i=0;i<s2.length;i++){
	System.out.println(s2[i]);
	}
      }
}
