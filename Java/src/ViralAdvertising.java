public class ViralAdvertising {
    public static void main(String[] args) {
        System.out.println(viralAdvertising(5));
    }

    public static int viralAdvertising(int n) {
        return recursiveViralAdvertising(5, n);
    }

    public static int recursiveViralAdvertising(int recipients, int days) {
        if (days <= 0) return 0;
        int likes = recipients / 2;
        int shares = likes * 3;
        return likes + recursiveViralAdvertising(shares, days-1);
    }
}
