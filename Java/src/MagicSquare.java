import java.util.*;
import java.util.stream.Collectors;

public class MagicSquare {
    List<List<Integer>> magicSquare = new ArrayList<>();

    int[][][] possibleSquares = new int[][][]{
            {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
            {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
            {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
            {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
            {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
            {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
            {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
            {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}}
    };

    public MagicSquare(int[][] startMagicSquare) {
        for (int[] row : startMagicSquare) {
            magicSquare.add(Arrays.stream(row).boxed().collect(Collectors.toList()));
        }
    }

    public MagicSquare(List<List<Integer>> magicSquare) {
        this.magicSquare = magicSquare;
    }

    public MagicSquare() {}

    public List<List<Integer>> getMagicSquare() {
        return magicSquare;
    }

    public int getValue(int index1, int index2) {
        return magicSquare.get(index1).get(index2);
    }

    public int getLeastDifference() {
        int leastDifference = Integer.MAX_VALUE;
        int currentDifference;
        for (int[][] array : possibleSquares) {
            currentDifference = difference(new MagicSquare(array));
            if (leastDifference > currentDifference) {
                leastDifference = currentDifference;
            }
        }
        return leastDifference;
    }

    public Map<Integer, MagicSquare> getLeastDifferenceWithMagicSquare() {
        MagicSquare leastMSquare = new MagicSquare();
        int leastDifference = Integer.MAX_VALUE;
        int currentDifference;
        for (int[][] array : possibleSquares) {
            MagicSquare mSquare = new MagicSquare(array);
            currentDifference = difference(mSquare);
            if (leastDifference > currentDifference) {
                leastDifference = currentDifference;
                leastMSquare = mSquare;
            }
        }
        Map<Integer, MagicSquare> finalMap = new HashMap<>();
        finalMap.put(leastDifference, leastMSquare);
        return finalMap;
    }

    public int difference(MagicSquare mSquare) {
        int totalDiff = 0;
        for (int i = 0; i < magicSquare.size(); i++) {
            for (int j = 0; j < magicSquare.get(i).size(); j++) {
                totalDiff += Math.abs(getValue(i,j) - mSquare.getValue(i,j));
            }
        }
        return totalDiff;
    }

    public void testSquare() {
        Map<Integer, MagicSquare> finalMap = getLeastDifferenceWithMagicSquare();
        System.out.println(this.magicSquare.toString());
        finalMap.forEach((k,v)->{
            System.out.println(k.toString());
            System.out.println(v.getMagicSquare().toString());
        });
    }

    public static void main(String[] args) {
        int[][] array = {{5, 3, 4}, {1, 5, 8}, {6, 4, 2}};
        MagicSquare magicSquare = new MagicSquare(array);
        magicSquare.testSquare();

        array = new int[][]{{4, 9, 2}, {3, 5, 7}, {8, 1, 5}};
        MagicSquare magicSquare2 = new MagicSquare(array);
        magicSquare2.testSquare();

        array = new int[][]{{4, 8, 2}, {4, 5, 7}, {6, 1, 6}};
        MagicSquare magicSquare3 = new MagicSquare(array);
        magicSquare3.testSquare();

        array = new int[][]{{1, 1, 1}, {1, 2, 1}, {1, 1, 1}};
        MagicSquare magicSquare4 = new MagicSquare(array);
        magicSquare4.testSquare();

        array = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        MagicSquare magicSquare5 = new MagicSquare(array);
        magicSquare5.testSquare();

        array = new int[][]{{7,6,5}, {7,2,8}, {5,3,4}};
        MagicSquare magicSquare6 = new MagicSquare(array);
        magicSquare6.testSquare();
    }
}
