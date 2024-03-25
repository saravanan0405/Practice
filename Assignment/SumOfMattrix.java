import java.util.Scanner;
public class SumOfMattrix{
public static void main(String s[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Row and Col value");
int row=sc.nextInt();
int col=sc.nextInt();
int arr1[][]=new int [row][col];
int arr2[][]=new int [row][col];
System.out.println("First matrix");
for(int i=0;i<arr1.length;i++){
for(int j=0;j<arr2.length;j++){
arr1[i][j]=sc.nextInt();
}
}
System.out.println("Second matrix");
for(int i=0;i<arr2.length;i++){
for(int j=0;j<arr2.length;j++){
arr2[i][j]=sc.nextInt();
}
}
System.out.println("Sum of two matrix");
for(int i=0;i<arr1.length;i++){
for(int j=0;j<arr2.length;j++){
System.out.println(arr1[i][j]+arr2[i][j]);
}
System.out.println();
}
}
}