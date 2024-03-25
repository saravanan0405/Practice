import java.util.Scanner;
class DublicateArrayValue
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array length");
int range=sc.nextInt();
int []arr=new int[range];
System.out.println("Array elements are");

for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
}
boolean []visited=new boolean[range];

for(int i=0;i<range-1;i++)
{
if(!visited[i]){
boolean isDoublicate=false;
for(int j=i+1;j<range;j++)
{
if(arr[i]==arr[j]){
isDoublicate=true;
visited[j]=true;
}
}

if(isDoublicate){
System.out.print("doublicate array value is="+arr[i]);
}
}
}
}
}




