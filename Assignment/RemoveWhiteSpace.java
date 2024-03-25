import java.util.Scanner;
class RemoveWhiteSpace
{
     public static void main(String args[])
{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s="Java is objext oriented programing language";
        String s2="";
        
        for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if(ch != ' '){
              s2=s2+ch;
}  
        
}
	  System.out.println(s2);
}
}
