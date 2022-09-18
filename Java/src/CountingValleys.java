public class CountingValleys {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */


    public static int countingValleys(int steps, String path) {
        int count = 0, sum = 0, valley = 0, oldVal = 0;
        while (steps > 0) {
            sum += path.charAt(count) == 'U' ? 1 : -1;
            if (sum == 0 && oldVal == -1) valley++;
            count++;
            steps--;
            oldVal = sum;
        }
        return valley;
    }
}
