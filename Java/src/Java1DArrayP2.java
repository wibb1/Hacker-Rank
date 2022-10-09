import java.util.ArrayList;

public class Java1DArrayP2 {


    public static boolean canWin(int leap, int[] game) {
        int length = game.length;
        return checkWin(0, leap, length - 1, game);
    }

    private static boolean checkWin(int index, int leap, int end, int[] game) {
        if (index > end) return true; // conditional succeed
        else if (index < 0 || game[index] == 1 ) return false; // prevents going too far back and catches blocking 1
        game[index] = 1; // prevents backwards move loop
        // return the three possible moves
        return checkWin(index + leap, leap, end, game)
                || checkWin(index - 1, leap, end, game)
                || checkWin(index + 1, leap, end, game);
    }

}
