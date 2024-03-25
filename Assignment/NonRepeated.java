import java.util.Scanner;
class NonRepeated
{
     public static void main(String s[])
{ 
         System.out.println("Enter the String"); 
         Scanner sc=new Scanner(System.in);                  
         String word=sc.nextLine();
         for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            boolean repeat=false;
         for(int j=i+1;j<word.length();j++){
            if(ch==word.charAt(j)){
            repeat=true; 
            break;
}
}
        if(repeat==false){
        System.out.println(ch+" non repeated");
        break;	
}
}
}
}