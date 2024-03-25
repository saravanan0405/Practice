import java.util.Arrays;
public class AscendingandDescending{
	public static void main(String s[]){
		int arr[]={32,54,12,73,4,18,28,7,31};
		System.out.println("Original Array="+Arrays.toString(arr));
		
		System.out.println("Ascending sorted array="+Arrays.toString(ascendingSort(arr)));
		System.out.println("Descending sorted array="+Arrays.toString(descendingSort(arr)));
         }
	        public static int[] ascendingSort(int[] arr){
			for(int i=0;i<arr.length;i++){
				for(int j=1;j<arr.length;j++){
				if(arr[j]<arr[j-1]){
				        int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		return arr;
		}
                
		public static int[] descendingSort(int[] arr){
		        for(int i=0;i<arr.length;i++){      
				for(int j=1;j<arr.length;j++){
	                	        if(arr[j]>arr[j-1]){
				        int val=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=val;
				}
			}
		}
		return arr;
	}
	
}
