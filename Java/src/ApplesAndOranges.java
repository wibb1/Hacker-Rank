import java.util.List;

public class ApplesAndOranges {
    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        fruitFalls(apples, a, s, t);
        fruitFalls(oranges, b, s, t);
    }

    public static void fruitFalls(List<Integer> fruits, int tree, int start,  int end) {
        int count = 0;
        for (int distance : fruits) {
            if (tree + distance >= start && tree + distance <= end) count++;
        }
        System.out.println(count);
    }
}
