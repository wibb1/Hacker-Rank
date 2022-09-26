import java.util.HashMap;
import java.util.List;

public class QueensAttack {
    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
        HashMap<String, Boolean> obstacleMap = genHashMap(obstacles);
        int squares = 0;
        int[][] directions = {new int[] {1, -1}, new int[] {1, 0}, new int[] {1, 1}, new int[] {0, 1}, new int[] {0, -1}, new int[] {-1, -1}, new int[] {-1, 0}, new int[] {-1, 1}};

        for (int[] direction : directions)
            squares += straightLine(n, r_q, c_q, direction[0], direction[1], obstacleMap);
    return squares;

    }

    public static HashMap<String, Boolean> genHashMap(List<List<Integer>> obstacles) {
        HashMap<String, Boolean> hashMap = new HashMap<>();
        for (List<Integer> obstacle : obstacles) hashMap.put(obstacle.get(0) + "," + obstacle.get(1), true);
        return hashMap;
    }

    public static int straightLine(int n, int r_q, int c_q, int rowI, int colI, HashMap<String, Boolean> obstacleMap) {
        int y = r_q + rowI;
        int x = c_q + colI;
        int total = 0;String key;
        while (x > 0 && x <= n && y > 0 && y <= n) {
            key = y + "," + x;
            if(obstacleMap.get(key) == null) {
                total++;
            } else {
                break;
            }
            x += colI;
            y += rowI;
        }
        return total;
    }
}
