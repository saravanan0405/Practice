import java.util.Scanner;
class EvenNumFront
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int range=sc.nextInt();
		int arr[]=new int[range];
		System.out.println("Array eleemnts are");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int temp=0,j=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			j++;
			}		
		}
		System.out.println();
		for(int k=0;k<arr.length;k++){
			System.out.println(arr[k]+" ");
		}
	}
}
        
        




