public class LongestSubString
{
	public static void main(String[] args) {
		String str = "xyzaeioxwqlyz";
		System.out.println("Length of the longest Subtring : "+lengthOfLongestSubstring(str));
		
	}
	static int lengthOfLongestSubstring(String str){
	    int n = str.length();
	    int start = 0;
	    int end = 0;
	    int maxLength = 0;
	    
	    while(end < n){
	        char currentChar = str.charAt(end);
	        
	        for(int i = start; i < end; i++){
	            if(str.charAt(i) == currentChar){
	                start = i+1;
	                break;
	            }
	        }
	        maxLength = Math.max(maxLength, end - start + 1);
	        end++;
	    }
	    return maxLength;
	}
}
