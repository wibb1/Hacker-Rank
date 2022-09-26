public class DrawingBook {
    public static int pageCount(int n, int p) {
        int back = n / 2 - p / 2;
        int front = p / 2;

        return Math.min(front, back);
    }
}
