import java.util.Scanner;
class CommonElementArray
{
  public static void main(String s[])
  {

    int arr1[]={1,2,3,4,5,6,7,8,9,39};
    int arr2[]={11,22,39,44,55,66,77,88,95,99};
    int arr3[]={9,19,29,39,49,59,69,79,89};
       for(int i=0;i<arr1.length;i++){
	  for(int j=0;j<arr2.length;j++){
		for(int k=0;k<arr3.length;k++){
			if(arr1[i]==arr2[j] && arr2[j]==arr3[k])
				System.out.println("commom elements are="+arr1[i]+" ");
		
		}
	}
	
    }
  }
}   
