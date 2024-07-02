public class BeautifulDays {
    public static int beautifulDays(int i, int j, int k) {
        int beautifulDays = 0;
        for (int l = i; l <= j; l++) {
            if ((l-reverseNumber(l)) % k == 0) beautifulDays++;
        }
        return beautifulDays;
    }

    public static int reverseNumber (int n) {
        int reversedNumber = 0;
        while (n !=0) {
            reversedNumber = reversedNumber * 10 + n % 10;
            n = n / 10;
        }
        return reversedNumber;
    }

    public static void main(String[] args) {
        System.out.println(beautifulDays(20,23,6));
    }
}
