
import java.util.*;

public class FourElementSum {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
		System.out.println("Enter the Range");
		
		int range = in.nextInt();
		int[] arr = new int[range];
		
		for(int i = 0; i < range; i++){
		    System.out.println("Enter the Element"+(i+1));
		    arr[i] = in.nextInt();
		}
		System.out.println("Enter the target");
        int targetSum = in.nextInt();

        findFourElementSum(arr, targetSum);
    }

   public static void findFourElementSum(int[] nums, int target) {
        
        sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            for (int j = i + 1; j < n - 1; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;
                    } else {
                        
                        System.out.println(nums[i] +" "+nums[j]+" "+nums[left]+" "+nums[right]);
                        while (left < right && nums[left] == nums[left + 1])
                            left++;
                        while (left < right && nums[right] == nums[right - 1])
                            right--;

                        left++;
                        right--;
                    }
                }
            }
        }
    }
    
    static void sort(int[] arr){
        
      int temp=0;
      for(int i=0;i<arr.length;i++)
      {
        for(int j=1;j<arr.length;j++)
        {
        if(arr[j]>arr[j-1]){
        temp=arr[j];
        arr[j]=arr[j-1];
        arr[j-1]=temp;
        }
      }
    }
  }
}
