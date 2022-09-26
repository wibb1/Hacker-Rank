import java.util.List;

public class TwoDArray {
    public static int calculateMaxSum(List<List<Integer>> arr) {
        int sum, maxSum = Integer.MIN_VALUE;
        for (int j = 0; j < arr.size() - 2; j++) {
            for (int i = 0; i < arr.size() - 2; i++) {
                sum = arr.get(j).get(i) + arr.get(j).get(i + 1) + arr.get(j).get(i + 2);
                sum += arr.get(j + 1).get(i + 1);
                sum += arr.get(j + 2).get(i) + arr.get(j + 2).get(i + 1) + arr.get(j + 2).get(i + 2);
                if (sum > maxSum) maxSum = sum;
            }
        }
        return maxSum;
    }
}
