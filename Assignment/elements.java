class elements
{
	public static void main(String s[]){
		int arr[]={1,2,4,5,6};
		int target=6;
		for(int i=0;i<arr.length;i++){
		      int sum=arr[i]+arr[i+1];
			if(target==sum){
				break;
			}
                    System.out.println(arr[i]+" "+arr[i+1]+"=the sum of two index");
		}


