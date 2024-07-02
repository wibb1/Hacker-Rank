import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CircularArrayRotation {
    public static void main(String[] args) {
        List<Integer> answer = circularArrayRotation(new ArrayList<>(Arrays.asList(1,2,3)),2, new ArrayList<>(Arrays.asList(0,1,2)));
        System.out.println(answer);
    }

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        for (int i = 0; i < k; i++) {
            Integer value = a.remove(a.size() - 1);
            a.add(0, value);
        }
        List<Integer> answer = new ArrayList<>();
        for (Integer index : queries) {
            answer.add(a.get(index));
        }
        return answer;
    }
}
