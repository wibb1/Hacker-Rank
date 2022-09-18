public class RepeatedString {
    public static long repeatedString(String s, long n) {
        long sum, multiples, total;
        int remainder;
        sum = aCount(s);
        multiples = n / (long) s.length();
        total = sum * multiples;
        remainder = (int) (n % s.length());
        if (remainder > 0) total += aCount(s.substring(0, remainder));
        return total;
    }

    public static long aCount(String s) {
        long sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') sum++;
        }
        return sum;
    }
}
