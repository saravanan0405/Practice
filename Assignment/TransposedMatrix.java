import java.io.*;                           
class TransposedMatrix{
public static void main(String s[]){
int arr[][]={{12,23,34},{45,56,67},{78,89,90}};
int tr[][]=new int[3][3];
for(int row=0;row<3;row++){
for(int col=0;col<3;col++){
tr[row][col]=arr[col][row];
}
}
System.out.println("Transposed array");
for(int row=0;row<3;row++){
for(int col=0;col<3;col++){
System.out.print(tr[row][col]+" ");
}
System.out.println();
}
}
}