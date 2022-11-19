import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubStringComparison {

    public static void main(String[] args) {
                /* finished - Java SubStringsComparison */
        SubStringComparison subStringComparison = new SubStringComparison();
        System.out.println(subStringComparison.getSmallestAndLargest("welcometojava", 3));

        System.out.println(subStringComparison.getSmallestAndLargest("doodlewaca", 3));
        /* finished - 2DArray */
        List<List<Integer>> arr = new ArrayList<>();
        Integer[] a1 = {1, 1, 1, 0, 0, 0};
        Integer[] a2 = {0, 1, 0, 0, 0, 0};
        Integer[] a3 = {1, 1, 1, 0, 0, 0};
        Integer[] a4 = {0, 0, 2, 4, 4, 0};
        Integer[] a5 = {0, 0, 0, 2, 0, 0};
        Integer[] a6 = {0, 0, 1, 2, 4, 0};
        arr.add(Arrays.asList(a1));
        arr.add(Arrays.asList(a2));
        arr.add(Arrays.asList(a3));
        arr.add(Arrays.asList(a4));
        arr.add(Arrays.asList(a5));
        arr.add(Arrays.asList(a6));

        TwoDArray twoDArray = new TwoDArray();
        System.out.println(twoDArray.calculateMaxSum(arr)); // 19
        /* finished - Java String Tokens */
        JavaStringTokens javaStringTokens = new JavaStringTokens();
        javaStringTokens.separateStrings("He is a very very good boy, isn't he?");
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "", largest = "", current;

        for (int i = 0 ; i<s.length()-k+1; i++){
            String s1 = s.substring(i, i + k);
            if(smallest.isEmpty()) {
                smallest = s1;
                largest = s1;
            } else if (s1.compareTo(smallest) < 0) {
                smallest = s1;
            } else if (s1.compareTo(largest) > 0) {
                largest = s1;
            }
        }

        return smallest + "\n" + largest;
    }
}
