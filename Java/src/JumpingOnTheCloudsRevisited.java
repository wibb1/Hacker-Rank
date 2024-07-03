public class JumpingOnTheCloudsRevisited {
    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(new int[]{0, 0, 1, 0}, 2) + " = 96");
        System.out.println(jumpingOnClouds(new int[]{0,0,1,0,0,1,1,0}, 2) + " = 92");
        System.out.println(jumpingOnClouds(new int[]{0,0,1,0,0,1,1,0}, 5) + " = 86");
        System.out.println(jumpingOnClouds(new int[]{0,0,1,0,0,1,1,0}, 8) + " = 99");
        System.out.println(jumpingOnClouds(new int[]{1,1,1,1,1,1,1,1}, 7) + " = 76");
    }

    static int jumpingOnClouds(int[] c, int k) {
        int e = 100;
        int length = c.length;
        int index = 0;
        do {
            index += k;
            index = index > length - 1 ? index - length : index;
            e -= c[index] == 1 ? 3 : 1;
        } while (e > 0 && index != 0);
        return e;
    }
}
