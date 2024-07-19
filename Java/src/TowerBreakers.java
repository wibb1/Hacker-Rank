public class TowerBreakers {

    public static void main(String[] args) {
        int n = 1, m = 4;
        String comma = ", ";
        System.out.println(n + comma + m + comma + towerBreakers(n, m) + " = " + "1");
        n = 2; m = 2;
        System.out.println(n + comma + m + comma + towerBreakers(n, m) + " = " + "2");
        n = 1; m = 7;
        System.out.println(n + comma + m + comma + towerBreakers(n, m) + " = " + "1");
        n = 3; m = 7;
        System.out.println(n + comma + m + comma + towerBreakers(n, m) + " = " + "1");
    }

    public static int towerBreakers(int n, int m) {
        /*
        n = number of towers
        m = tower height at start
        players alternate starting with player 1
         */
        return (m == 1 || n % 2 == 0) ? 2 : 1;
    }
}
