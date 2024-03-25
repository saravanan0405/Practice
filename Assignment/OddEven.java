import java.util.Arrays;
import java.util.Scanner;
public class OddEven{
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int range=sc.nextInt();
	 	int a[]=new int[range];
		System.out.println("Enter the elemets");
		for(int value=0;value<range;value++){
			a[value]=sc.nextInt();
		}
		int temp;
		for(int i=1;i<a.length;i+=2){
			for(int j=i+2;j<a.length;j+=2){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i+=2){
			for(int j=i+2;j<a.length;j+=2){
				if(a[i]<a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
