import java.util.*;

public class SmallestIncreasingSubArray
{
	public static void main(String[] args) {
	   int[] arr = {18,12,7,15,4,9,8,3};
	   System.out.println("Original array : " + Arrays.toString(arr));
	   System.out.println("Output array : " +Arrays.toString(longestSubArray(arr)));
	   
	}
	static int[] longestSubArray(int[] arr){
	    
	    
	    int currentLength = 1;
	    int minLength = Integer.MAX_VALUE;
	    int startIndex = 0;
	    int endIndex = 0;
	    
	    for(int i = 1; i < arr.length; i++){
	        if(arr[i] > arr[i-1]){
	            currentLength++;
	        }
	        
	        else{
	            if(currentLength < minLength){
	            minLength = currentLength;
	            endIndex = i - 1;
	            startIndex = endIndex - minLength + 1;
	        }
	        
	        currentLength = 1;
	    }
	    }
	    if(currentLength < minLength && currentLength > 1){
	        minLength = currentLength;
	        endIndex = arr.length - 1;
	        startIndex = endIndex - minLength + 1;
	    }
	    
	    int[] result = new int[minLength];
	    System.arraycopy(arr, startIndex, result, 0, minLength);
	    return result;
	}
}
