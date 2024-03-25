import java.util.Scanner;
class Fact
{
	public static void main(String s[])
{
	int val=1;
	for(int row=1;row<=5;row++){
		for(int col=1;col<=row;col++){
			System.out.print(val+" ");
	                val++;
		}
	
		System.out.println();
	}
}
}
