import java.util.*;

public class Anagram
{
	public static void main(String[] args) {
	    
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first string ");
		String str1 = in.nextLine();
		
		System.out.println("Enter the second string");
		String str2 = in.nextLine();
		
		int n1 = str1.length();
		int n2 = str2.length();
		
		boolean isAnagram = true;
		
		if(n1 != n2){
		    isAnagram = false;
		}
		
		String s1 = str1.trim().replaceAll("\\s+", "");
		String s2 = str2.trim().replaceAll("\\s+", "");
		
		char[] char_str1 = s1.toCharArray();
		char[] char_str2 = s2.toCharArray();
		
		sorting(char_str1);
		sorting(char_str2);
		
		boolean ans = Arrays.equals(char_str1,char_str2);
		
		if(ans){
		    isAnagram = true;
		}else{
		    isAnagram = false;
		}
		
		System.out.println(isAnagram ? "strings are anagrams" : "strings are not an anagrams");
		
	}
	static void sorting(char[] array){
	    
	    for(int i = 0; i < array.length; i++){
	        for(int j = 1; j < array.length; j++){
	            if(array[j] < array[j-1]){
	                char temp = array[j];
	                array[j] = array[j-1];
	                array[j-1] = temp;
	            }
	        }
	    }
	}
	
}
