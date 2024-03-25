import java.util.Scanner;

public class MostFrequentChar
{
	public static void main(String[] args) {
	    
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = in.nextLine();
		
		String new_str = str.replace(" ","");
		System.out.println("Most frequent character is : " + mostFrequentCharacter(new_str));
		
	}
	
	static char mostFrequentCharacter(String str){
	    
	    int mostFrequent = 0;
	    char mostFrequentChar = ' ';
	    
	    for(int i = 0; i < str.length(); i++){
	        int currentFreq = 0;
	        
	        for(int j = 0; j < str.length(); j++){
	            if(Character.toLowerCase(str.charAt(j)) == Character.toLowerCase(str.charAt(i))){
	                currentFreq++;
	            }
	        }
	        
	        if(currentFreq > mostFrequent){
	            mostFrequent = currentFreq;
	            mostFrequentChar = str.charAt(i);
	        }
	    }
	    return mostFrequentChar;
	}
}
