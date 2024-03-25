import java.util.Scanner;
import java.util.Arrays;

public class StringSorting {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of words you will enter ");
        int range = in.nextInt();
        String[] str = new String[range];
        
        for (int i = 0; i < range; i++) {
            str[i] = in.next();
        }
        
        System.out.println("Before sorting the array " + Arrays.toString(str));

        for (int i = 0; i < str.length; i++) {
            for (int j = 1; j < str.length; j++) {
                int pos = 0;
                while(pos < str[j].length() && pos < str[j-1].length() 
                && str[j].charAt(pos) == str[j-1].charAt(pos)){
                    pos++;
                }
                if(pos < str[j].length() && pos < str[j-1].length() 
                && str[j].charAt(pos) < str[j-1].charAt(pos)){
                    String temp = str[j];
                    str[j] = str[j-1];
                    str[j-1] = temp;
                }
                }
            }
        

        System.out.println("After sorting the array " + Arrays.toString(str));
    }
}
