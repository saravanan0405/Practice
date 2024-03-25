import java.util.Scanner;
public class IndexofElements{
	public static void main(String s[]){
         	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int range=sc.nextInt();
		System.out.println("Enter the target");
		int target=sc.nextInt();
		int a[]=new int [range];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++){
		if(target==a[i]){
		 System.out.print(i);
		 break;
                }
                else{
                if(i==a.length-1){
                System.out.println("-1");
                }
}
}
}
}
