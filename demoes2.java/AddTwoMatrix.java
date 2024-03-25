import java.util.Scanner;
class AddTwoMatrix
{
  public static void main(String s[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the row and col");
  int row=sc.nextInt();
  int col=sc.nextInt();
  int arr1[][]=new int[row][col];
  int arr2[][]=new int[row][col];
  int arr3[][]=new int[arr1.length][arr2.length];
  System.out.println("First Matrix");
  for(int i=0;i<arr1.length;i++){
  for(int j=0;j<arr1.length;j++){
  arr1[i][j]=sc.nextInt();
  }
  }
  System.out.println("Second Matrix");
  for(int i=0;i<arr2.length;i++){
  for(int j=0;j<arr2.length;j++){
  arr2[i][j]=sc.nextInt();
  }
  }
  System.out.println("sum of matrix");
  for(int i=0;i<arr1.length;i++){
  for(int j=0;j<arr2.length;j++){
  arr3[i][j]=arr1[i][j]+arr2[i][j];
  System.out.print(arr3[i][j]+" ");
  }
  System.out.println();
  }
 }
}
  
