import java.util.*;

public class LongestIncreasingSubArray
{
	public static void main(String[] args) {
	   int[] arr = {1,4,2,7,5,9,3,6,8};
	   System.out.println("Original array : " + Arrays.toString(arr));
	   System.out.println("Output array : " +Arrays.toString(longestSubArray(arr)));
	   
	}
	static int[] longestSubArray(int[] arr){
	    
	    
	    int currentLength = 1;
	    int maxLength = 1;
	    int startIndex = 0;
	    int endIndex = 0;
	    
	    for(int i = 1; i < arr.length; i++){
	        if(arr[i] > arr[i-1]){
	            currentLength++;
	        }
	        
	        else{
	            if(currentLength > maxLength){
	            maxLength = currentLength;
	            endIndex = i - 1;
	            startIndex = endIndex - maxLength + 1;
	        }
	        
	        currentLength = 1;
	    }
	    }
	    if(currentLength > maxLength){
	        maxLength = currentLength;
	        endIndex = arr.length - 1;
	        startIndex = endIndex - maxLength + 1;
	    }
	    
	    int[] result = new int[maxLength];
	    System.arraycopy(arr, startIndex, result, 0, maxLength);
	    return result;
	}
}
