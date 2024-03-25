import java.util.Arrays;
import java.util.Scanner;
class MoveZero
{
	public static void main(String s[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the array length");
	int range=sc.nextInt();
	int arr[]=new int[range];
	for(int i=0;i<arr.length;i++){
		arr[i]=sc.nextInt();
	}
                   System.out.println(Arrays.toString(movezero(arr)));
}
	static int[]  movezero(int[] arr){
		int[] result=new int[arr.length];
		int count=0;
		for(int i=0;i<result.length;i++){
			if(arr[i]!=0){
				result[count++]=arr[i];
			}
		}
		while(count<arr.length){
			result[count++]=0;
		}
		return result;
	}
}

