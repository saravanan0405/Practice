import java.util.Scanner;
class Longestconsective{
public static void main(String s[]){
Scanner input =new Scanner(System.in);
System.out.println("Enter the array");
int range=new input.nextInt();
int array[]=new int [range];
for(int i=0;i<range;i++){
System.out.println("Enter the element"+i+1);
array[i]=input.nextInt(i);
}
System.out.println(FindLongestconsectiveElement (array));
}
static int FindLongestconsectiveElement(int [] array){
int n=array.length;
int currentLength=1;
int max=1;
for(int i=0;i<n;i++){
if(array[i]>array[i-1]){
currentLength++;
}
else{
if(currentLength > max){
currentLength=max;
}
currentLength=-1;
}
if(currentLength>max){
max=currentLength;
}
return max;
}
}
}
