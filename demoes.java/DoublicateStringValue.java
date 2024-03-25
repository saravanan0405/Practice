import java.util.Scanner;
class DoublicateStringValue
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the range");
int range=sc.nextInt();
String arr[]=new String[range];
System.out.println("String Elements are");
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextLine();
}
boolean visited[]=new boolean[range];
for(int i=0;i<range-1;i++)
{
if(!visited[i]){
boolean isDoublicate =false;
for(int j=i+1;j<range;j++){
if(arr[i].equals(arr[j])){
isDoublicate =true;
visited[j]=true;
}
}
if(isDoublicate){
System.out.println("doublicate string value is="+arr[i]+" ");
}
}
}
}
}
