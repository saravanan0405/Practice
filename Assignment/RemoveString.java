import java.util.Scanner;
public class RemoveString{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		System.out.println("Enter the target");
		char target=sc.next().charAt(0);
		String s1="";
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch!=target){
				s1+=ch;
			}
		}
		System.out.println("After remove the target="+s1);
	}
}
