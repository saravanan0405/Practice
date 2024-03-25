import java.util.Scanner;
public class Guessnum2{
      public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int guessnum;
	int secretnum=(int)(Math.random()*100)+1;
	int guesscount=0;
	System.out.println("welcome to guess num");
	System.out.println("Guess num between 1 to 100");
	do{
		System.out.println("Enter the Guess num");
		guessnum=sc.nextInt();
		guesscount++;
       if(guessnum<secretnum){
	       System.out.println("guess num is high");
       }
       else if(guessnum>secretnum){
	       System.out.println("guess num is low");
       }
       else
	       System.out.println("congratlation your guessed correct num "+ guesscount+" guesses");
	}
       while(guessnum!=secretnum);
}
}
