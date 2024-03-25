import java.util.Scanner;
class Union
{
	public static void main(String s[])
	{
	 
	 Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the range");
	
	int range=sc.nextInt();
	
	int arr1[]=new int[range];
	
	System.out.println("Array elements are");
	
	for(int i=0;i<arr1.length;i++)
	{
		arr1[i]=sc.nextInt();
		
	}
	System.out.println("Enter the value");
	int value=sc.nextInt();
	
	int arr2[]=new int[value];
	
	System.out.println("Array elements are");
	
	for(int i=0;i<arr2.length;i++)
	{
		arr2[i]=sc.nextInt();
		
	}

	System.out.println("ans of union array : ");
	
	union(arr1,arr2);
	 System.out.println();
	 
	System.out.println("ans of intersection : ");
	
	intersection(arr1,arr2);
}
	   
	  public static void union(int []arr1,int []arr2)
	   {
	   
	   int i=0,j=0;
	     int m=arr1.length;
	       int n=arr2.length;
	       
	       while(i<m && j<n)
	       {
	          if(arr1[i]<arr2[j])
	          {
	             System.out.print(arr1[i++]);
	            }
	            
	           else if(arr1[i]>arr2[j]) 
                  {
                        System.out.print(arr2[j++]);
                      }
                      
                      else{
                      System.out.print(arr1[i++]);
                       j++;
                          }
                         
              }
              
              while(i<m){
                System.out.print(arr1[i++]);
                }
                while(j<n)
                {
                  System.out.print(arr2[j++]);
                 }
                 
               
                                      
}

            static void intersection(int [] arr1,int arr2[])
            {
                int a=arr1.length;
                int b=arr2.length;
                
                int i=0,j=0;
                 while(i< a && j < b)
                 {
                  
                  if(arr1[i] < arr2[j])
                  {
                    i++;
                    }
                    else if(arr1[i] > arr2[j])
                      {
                         j++;
                       }
                       else{
                          System.out.println(arr1[i++]);
                          j++;
                         }
                      }
                 }
                         
}
		
