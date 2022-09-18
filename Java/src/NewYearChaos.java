import java.util.List;

public class NewYearChaos {

    public static void minimumBribes(List<Integer> q) {
        int listLength = q.size();
        int bribes = 0;
        boolean trigger = false;
        boolean swapped;

        while (true) {
            swapped = false;
            for (int i = 0; i < listLength - 1; i++) {
                Integer first = q.get(i);
                Integer second = q.get(i + 1);
                if (first - i - 1 > 2) trigger = true;
                if (first > second) {
                    q.set(i, second);
                    q.set(i + 1, first);
                    swapped = true;
                    bribes++;
                }
            }
            if(!swapped) break;
        }
        String answer = trigger ? "Too chaotic" : "" + bribes;
        System.out.println(answer);
    }
}
