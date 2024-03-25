import java.util.Arrays;
public class CommonElements{
	public static void main(String s[]){
		int arr1[]={12,34,87,95,45,39,28,71,63,49,91};
		int arr2[]={78,23,43,98,12,3,71,91,55,28,61};
		int elements[] = new int[arr1.length];
		int count=0;
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr1.length;j++){
				if(arr1[i]==arr2[j]){
			        elements[count++] = arr1[i];
				
				}
				}
		}
		System.out.println(Arrays.toString(Arrays.copyOf(elements, count)));
	}
}    
