public class Fibinaccisequence{
public static void main(String s[]){
	int first=0;
	int second=1;
	int third;
	System.out.print(first+" "+second);
	for(int i=2;i<10;i++){
		third=first+second;
		System.out.print(" "+third);
		first=second;
		second=third;
	}
}
}
                
