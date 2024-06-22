import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.toList;

public class ClimbingLeaderboard {

    /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        ArrayList<Integer> ranksList = new ArrayList<>();
        ArrayList<Integer> ranks = new ArrayList<>(new HashSet<>(ranked));
        Collections.sort(ranks);
        int counter = 0;
        for (int score  :  player) {
            while (counter < ranks.size() && score >= ranks.get(counter)) {
                counter++;
            }
            ranksList.add(ranks.size() - counter);
        }
        return ranksList.stream().map(a -> a + 1).collect(toList());
    }

    public static void main(String[] args) throws IOException {
        List<Integer> ranked = new ArrayList<>(Arrays.asList(100, 90, 90, 80));
        List<Integer> player = new ArrayList<>(Arrays.asList(70, 80, 105));
        System.out.println("[4, 3, 1] " + ClimbingLeaderboard.climbingLeaderboard(ranked, player));

        ranked = new ArrayList<>(Arrays.asList(100, 100, 50, 40, 40, 20, 10));
        player = new ArrayList<>(Arrays.asList(5, 25, 50, 120));
        System.out.println("[6, 4, 2, 1] " + ClimbingLeaderboard.climbingLeaderboard(ranked, player));

        ranked = new ArrayList<>(Arrays.asList(100, 90, 90, 80, 75, 60));
        player = new ArrayList<>(Arrays.asList(50, 65, 77, 90, 102));
        System.out.println("[6, 5, 4, 2, 1] " + ClimbingLeaderboard.climbingLeaderboard(ranked, player));
    }
}
