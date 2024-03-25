import java.util.Scanner;
class LongestConsective
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array range");
		int range=sc.nextInt();
		int arr[]=new int[range];
		for(int i=0;i<arr.length;i++){
		System.out.println("Enter the array elements"+(i+1));
			arr[i]=sc.nextInt();
		}

		if(arr.length==0){
			System.out.println("Longest consective elements is= "+0);
			return;
	}
	
	sort(arr);
     System.out.println("Longest consective elements is="+LongestConsective(arr));
	}
		static int[] sort(int arr[])
		{
		for(int i=0;i<arr.length;i++)
		{
		 for(int j=1;i<arr.length;i++)
		 {
			 if(arr[j]<arr[j-1])
			 {
				 int temp=arr[j];
				 arr[j]=arr[j-1];
				 arr[j-1]=temp;
			 }
		 }
		}
                  return arr;
		}

	static int LongestConsective(int arr[])
	{
		int len=arr.length;
		int currentlength=1;
		int maxlength=1;

          for(int i=0;i<len-1;i++){
		  if(arr[i]==arr[i+1]){
			  continue;
		  }
			  else if(arr[i]+1==arr[i+1]){
                          currentlength++;
			  }
			  else
			  {
			if(currentlength>maxlength){
		          maxlength=currentlength;
			}
                          currentlength=1;
			  }
		  }
             if(currentlength>maxlength){
                maxlength=currentlength;
	     }
		return maxlength;
	}
	
}
		
	}


