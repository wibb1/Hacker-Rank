public class UtopianTree {

    public static void main(String[] args) {

        /* finished - Utopian Trees */
        UtopianTree utopianTree = new UtopianTree();
        System.out.println(
            utopianTree.utopianTree(0) + "\n" + // 1
            utopianTree.utopianTree(1) + "\n" + // 2
            utopianTree.utopianTree(4) + "\n" + // 7
            utopianTree.utopianTree(3) + "\n"   // 6
        );
    }

    public static int utopianTree(int n) {
        int height = 1;

        for (int i = 1; i <= n; i++) {
            height = i % 2 != 0 ? height * 2 : height + 1;
        }
        return height;
    }
}
