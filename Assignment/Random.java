import java.util.Scanner;
public class Random{
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		int secretNum=(int)(Math.random()*10)+1;
		int guessNum;
		int guessCount=0;
		System.out.println("Welcome To Guess Number");
		System.out.println("Guess num between 1 to 10");
		do{
			System.out.println("Enter the number");
                       guessNum=sc.nextInt();
			guessCount++;
			if(guessNum<secretNum){
				System.out.println("To Low try again");
			}
			else if(guessNum>secretNum){
				System.out.println("To high try again");
			}
			else
				System.out.println("Congratlation you guessed correctly in "+guessCount+" Guesses");
		}
		while(guessNum!=secretNum);
	}
}
		
