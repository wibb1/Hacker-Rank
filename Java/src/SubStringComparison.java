public class SubStringComparison {
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
