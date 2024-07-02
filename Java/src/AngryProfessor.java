import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AngryProfessor {
    /*
     * Complete the 'angryProfessor' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY a
     */

    public static String angryProfessor(int k, List<Integer> a) {
        int students = 0, counter = 0;

        while (students <= k && counter < a.size()) {
            if (a.get(counter) <= 0) students++;
            counter++;
        }
        return students >= k ? "NO" : "YES";
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(-2,-1,0,1,2));
        System.out.println(angryProfessor(3, a));

        a = new ArrayList<>(Arrays.asList(-1,-3,4,2));
        System.out.println(angryProfessor(3, a));

        a = new ArrayList<>(Arrays.asList(0,-1,1,2));
        System.out.println(angryProfessor(2, a));
    }
}
