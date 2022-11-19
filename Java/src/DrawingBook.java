public class DrawingBook {

    public static void main(String[] args) {
                /* finished - Drawing Book */
        DrawingBook drawingBook = new DrawingBook();
        System.out.println(
                drawingBook.pageCount(5,3) + "\n" +  // 1
                drawingBook.pageCount(6,2) + "\n" +  // 1
                drawingBook.pageCount(5,4) + "\n" +  // 0
                drawingBook.pageCount(15,4) + "\n" + // 2
                drawingBook.pageCount(20,15) + "\n"   // 3
        );
    }

    public static int pageCount(int n, int p) {
        int back = n / 2 - p / 2;
        int front = p / 2;

        return Math.min(front, back);
    }
}
