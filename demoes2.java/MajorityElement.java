import java.util.Scanner;
public class MajorityElement
{
	public static int majority(int arr[]){
		int count=1;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
		
		if(count>arr.length/2){
		return arr[i];
		}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Range");
		int range = in.nextInt();
		int[] arr = new int[range];
		for(int i = 0; i < range; i++){
		    System.out.println("Enter the Element"+(i+1));
		    arr[i] = in.nextInt();
		}
		System.out.println(majority(arr));
	}
}
