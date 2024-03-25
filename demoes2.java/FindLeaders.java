public class FindLeaders {
    public static void Leaders(int[] a) {
        int n = a.length;
        int maxFrom = a[n - 1];

        System.out.println("Leaders in the array: " + maxFrom);

        for (int i = n - 2; i >= 0; i--) {
            if (a[i] > maxFrom) {
                maxFrom = a[i];
                System.out.print(maxFrom+ " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {89,34,12,7,9,2,15};
        Leaders(a);
    }
}



