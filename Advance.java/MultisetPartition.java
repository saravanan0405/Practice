import java.util.*;

public class MultisetPartition {
    
     public static void main(String[] args) {
         
         Scanner in = new Scanner(System.in);
		System.out.println("Enter the Range");
		int range = in.nextInt();
		int[] multiSet = new int[range];
		for(int i = 0; i < range; i++){
		    System.out.println("Enter the Element"+(i+1));
		    multiSet[i] = in.nextInt();
		}
		System.out.println(canPartitionMultiset(multiSet));
    }
    
    public static boolean canPartitionMultiset(int[] multiset) {
        int totalSum = 0;
        for (int num : multiset) {
            totalSum += num;
        }
        if (totalSum % 2 != 0) {
            return false;
        }

        int targetSum = totalSum / 2;
        return canPartitionMultisetHelper(multiset, targetSum, 0);
    }

    private static boolean canPartitionMultisetHelper(int[] multiset, int targetSum, int index) {
        if (targetSum == 0) {
            return true;
        }
        if (targetSum < 0 || index >= multiset.length) {
            return false;
        }

        if (canPartitionMultisetHelper(multiset, targetSum - multiset[index], index + 1) ||
        	canPartitionMultisetHelper(multiset, targetSum, index + 1)) {
            return true;
        }


        return false;
    }

}
