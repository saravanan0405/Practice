import java .util.Scanner;
public class Contains{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String");
String s=sc.nextLine();
boolean contains=false;
for(int i=0;i<s.length();i++){
if(i<s.length()-3 && s.charAt(i)=='j' && s.charAt(i+1)=='a' && s.charAt(i+2)=='v' && s.charAt(i+3)=='a'){
contains=true;
break;
}
}
if(contains==true){
System.out.println("The String contains java");
}
else
System.out.println("The string doesn't contains java");
}
}
