import java.util.Scanner;
class RemoveDublicateElement
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array length");
int range=sc.nextInt();
int []arr=new int[range];
for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
}
boolean []visited=new boolean[range];
for(int i=0;i<range-1;i++)
{
if(!visited[i]){
for(int j=i+1;j<range;j++)
{
if(arr[i]==arr[j]){
visited[j]=true;
}
}
}
}
for(int i=0;i<arr.length;i++){
if(!visited[i]){
System.out.println(arr[i]+" ");
}
}
}
}
