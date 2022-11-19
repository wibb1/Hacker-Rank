import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Java1DArrayP2 {

    public static void main(String[] args) throws FileNotFoundException {
                /* finished -  */
        Java1DArrayP2 java1DArrayP2 = new Java1DArrayP2();
        File file = new File("./src/test.txt");
        Scanner scan = new Scanner(file);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((Java1DArrayP2.canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();


        System.out.println(java1DArrayP2.canWin(3, new int[]{0, 0, 0, 0, 0}) ? "YES" : "NO");
        System.out.println(java1DArrayP2.canWin(5, new int[]{0, 0, 0, 1, 1, 1}) ? "YES" : "NO");
        System.out.println(java1DArrayP2.canWin(3, new int[]{0, 0, 1, 1, 1, 0}) ? "YES" : "NO");
        System.out.println(java1DArrayP2.canWin(1, new int[]{0, 1, 0}) ? "YES" : "NO");
    }

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
