import java.util.ArrayList;
import java.util.List;

public class Candies {

    public static long candies(int n, List<Integer> arr) {
        long current = 1L;
        ArrayList<Long> totalCandy = new ArrayList<>();
        totalCandy.add(current);
        for (int i = 0; i < arr.size() - 1; i++) {
            current = checkStudent(arr.get(i), arr.get(i + 1), current);
            totalCandy.add(current);
        }
        current = 1L;
        for (int i = arr.size()-1; i > 0; i--) {
            if (current > totalCandy.get(i)) {
                totalCandy.set(i, current);
            }
            current = checkStudent(arr.get(i), arr.get(i - 1), current);
        }
        if(arr.get(0) > arr.get(1)) totalCandy.set(0, totalCandy.get(1) + 1);
        return totalCandy.stream().reduce(0L, Long::sum);
    }

    public static long checkStudent(Integer s1, Integer s2, long current) {
        return s1 < s2 ? current + 1 : 1;
    }


}
