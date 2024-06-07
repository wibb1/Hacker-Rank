import java.io.*;
import java.util.*;

class Result {
    public static int lonelyInteger(List<Integer> a) {
        Map<Integer, Integer> occurrances = new HashMap<>();
        for (Integer num : a) {
            if (occurrances.containsKey(num)) {
                occurrances.replace(num, occurrances.get(num) + 1);
            } else {
                occurrances.put(num, 1);
            }
        }
        return getSingleValue(occurrances);

    }

    private static int getSingleValue(Map<Integer, Integer> entries) {
        for (Map.Entry<Integer, Integer> entry : entries.entrySet()) {
            if (Objects.equals(1, entry.getValue())) {
                return entry.getKey();
            }
        }
        return -1;
    }

}

public class LonelyInteger {
    public static void main(String[] args) throws IOException {
        System.out.println(Result.lonelyInteger(new ArrayList<>(Arrays.asList(1))));
        System.out.println( Result.lonelyInteger(new ArrayList<>(Arrays.asList(1, 1, 2))));
        System.out.println( Result.lonelyInteger(new ArrayList<>(Arrays.asList(0,0, 1, 2, 1))));
    }
}
