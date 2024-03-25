import java.util.Arrays;
import java.util.Scanner;
class CommonElementString
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the range");
int range=sc.nextInt();
System.out.println("First String elements are");
String arr[]=new String[range];
sc.nextLine();

for(int i=0;i<arr.length;i++){
arr[i]=sc.nextLine();
}
String arr1[]=new String[range];
System.out.println("Second elements are");
for(int i=0;i<arr1.length;i++){
arr1[i]=sc.nextLine();
}
String elements[]=new String[range];
int count=0;
for(int i=0;i<arr.length;i++){
for(int j=0;j<arr.length;j++){
if(arr[i].equals(arr1[j])){
elements[count++]=arr[i];
}
}
}
System.out.println("Common string elements="+Arrays.toString(Arrays.copyOf(elements,count)));
}
}

