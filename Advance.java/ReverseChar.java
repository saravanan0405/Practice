import java.util.Scanner;

public class ReverseChar{
	public static void main(String[] args){
	
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the range");
	int range = in.nextInt();
	char[] charArray = new char[range];
	
	for(int i =0; i < range; i++){
		System.out.println("Enter the char"+(i+1));
		charArray[i] = in.next().charAt(0);
	}
	
	int left=0,right=charArray.length-1;
	char temp=0;
	while(left<right){
	     
	     temp=charArray[left];
	     charArray[left]=charArray[right];
	     charArray[right]=temp;
	     left++;
	     right--;
	     }
	    
		System.out.println("After Reversing");
		for(int k=0;k<charArray.length;k++){
			System.out.print(charArray[k] + " ");
		}
	}
}	
