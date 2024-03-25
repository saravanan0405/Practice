import java.util.Scanner;

public class SortNumericAndStringArray{
	public static void main(String[] args){
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the integer array range");
		int intRange = in.nextInt();
		
		
		
		int[] num_array = new int[intRange];
		
		
		
		System.out.println("Enter the integer elements ");
		
		for(int i = 0; i < intRange; i++){
			System.out.println("Enter the Element"+(i+1));
			num_array[i]  = in.nextInt();
		}
		
		
		
		System.out.println("Enter the String array range");
		
		int stringRange = in.nextInt();
		
		System.out.println("Enter the String Elements ");
		
		String[] string_array = new String[stringRange];
		in.nextLine();
		
		for(int i = 0; i < stringRange; i++){
			System.out.println("Enter the element"+(i+1));
			string_array[i]  = in.nextLine();
		}
		
		sortNumeric(num_array);
		sortString(string_array);
		
		for(int num : num_array){
			System.out.print(num + " ");
		}
		System.out.println();
		for(String str : string_array){
			System.out.print(str + " ");
		}
		
	}
	static String[] sortString(String[] str){
	
		for (int i = 0; i < str.length; i++) {
              		 for (int j = 1; j < str.length - i; j++) {
               	 int pos = 0;
               	 
              		 while (pos < str[j].length() && pos < str[j-1].length() 
                       		 && Character.toLowerCase(str[j].charAt(pos)) == Character.toLowerCase(str[j-1].charAt(pos))) {
                   			 pos++;
              		  }
                
                	if (pos < str[j].length() && pos < str[j-1].length() 
                        	  && Character.toLowerCase(str[j].charAt(pos)) < Character.toLowerCase(str[j-1].charAt(pos))) 
                        	  {
                    		  String temp = str[j];
                    		  str[j] = str[j-1];
                   		  str[j-1] = temp;
                    	         }
                
            	    	}
       	 }
       	 return str;
        }
        
        static int[] sortNumeric(int[] arr){
             
             int temp=0;
        	
        	for(int i=0;i<arr.length;i++){
        	  for(int j=1;j<arr.length;j++){
        	   if(arr[j]<arr[j-1]){
        	       temp=arr[j];
        	       arr[j]=arr[j - 1];
        	       arr[j-1]=temp;
        	       }
        	     }
        	  }
        	  
        	   
        	return arr;
        }
 }
        
        	
