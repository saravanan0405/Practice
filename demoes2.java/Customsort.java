import java.util.Arrays;
public class Customsort {
    public static void main(String[] args) {
        int[] arr = {11,9,4,23,78,54,27,32};
        customSort(arr);
    }

    public static void customSort(int[] arr) {
        int temp=0;
        for(int i=0;i<arr.length;i++){
        for(int j=1;j<arr.length;j++){
            if(arr[j]<arr[j-1]){
            temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            }
            }
            }
        int left = 0, right =  arr.length - 1;
        
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[right--]+" ");
            System.out.print(arr[left++]+" ");
        }

    }
}
