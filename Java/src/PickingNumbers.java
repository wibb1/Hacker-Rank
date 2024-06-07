import java.util.*;

public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        a.sort(Integer::compareTo);
        int count, totalCount = 0, aSize = a.size();
        for (int i = 0; i < aSize; i++) {
            count = 1;
            for (int j = i + 1; j < aSize; j++) {
                if (a.get(j) - a.get(i) <= 1) count++;
            }
            if (totalCount < count) totalCount = count;
        }
        return totalCount;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 4, 4, 5, 5, 5));
        System.out.println(pickingNumbers(a));
        a = new ArrayList<>(Arrays.asList(4, 6, 5, 3, 3, 1));
        System.out.println(pickingNumbers(a));
    }

}
