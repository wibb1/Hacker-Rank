import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationEquation {
    public static void main(String[] args) {
        List<Integer> p = new ArrayList<>(Arrays.asList(5, 2, 1, 3, 4));
        System.out.println(p);
        System.out.println(permutationEquation(p));
    }

    public static List<Integer> permutationEquation(List<Integer> p) {
        List<Integer> answer = new ArrayList<>();
        for (int x = 1; x < p.size() + 1; x++) {
            answer.add(1 + p.indexOf(p.indexOf(x) + 1));
        }
        return answer;
    }

}
/*
p = [5, 2, 1, 3, 4]
x = 1
1 is in the 3rd position // i = 2; value = 3
3 is in the 4th position // i = 3; value = 4
 */
