import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Candies {

    public static void main(String[] args) {
        /* finished - CANDIES */
        Integer[] array5 = {9, 8, 7, 6, 5, 4, 3, 2};
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(array5));
        System.out.println(Candies.candies(8, arrayList1) + " = " + 36);
        System.out.println("-------------------------------");
        Integer[] array1 = {2, 4, 3, 5, 2, 6, 4, 5};
        arrayList1 = new ArrayList<>(Arrays.asList(array1));
        System.out.println(Candies.candies(8, arrayList1) + " = " + 12);
        System.out.println("-------------------------------");
        Integer[] array2 = {2, 4, 2, 6, 1, 7, 8, 9, 2, 1};
        arrayList1 = new ArrayList<>(Arrays.asList(array2));
        System.out.println(Candies.candies(8, arrayList1) + " = " + 19);
        System.out.println("-------------------------------");
        Integer[] array3 = {6, 4, 2, 6, 1, 7, 8, 9, 2, 1};
        arrayList1 = new ArrayList<>(Arrays.asList(array3));
        System.out.println(Candies.candies(8, arrayList1) + " = " + 21);
        System.out.println("-------------------------------");
        Integer[] array4 = {2, 3, 4, 5, 6, 7, 8, 9};
        arrayList1 = new ArrayList<>(Arrays.asList(array4));
        System.out.println(Candies.candies(8, arrayList1) + " = " + 36);
        System.out.println("-------------------------------");
    }

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
