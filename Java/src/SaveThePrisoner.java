public class SaveThePrisoner {
    public static void main(String[] args) {
        System.out.println(saveThePrisoner(4,6,2) + " = 3"); // 6 - 1 = 5 (2) - 4 = 1 (2) - 2 = 0 (1
        System.out.println(saveThePrisoner(15,30,15) + " = 14"); // 30 - 1 + 29 (15) - 15 = 14
        System.out.println(saveThePrisoner(5,28, 3) + " = 5"); // 28 - 1 = 27 (3) - 5 = 22 (3) - 5 = 17 (3) - 5 = 12 (3) - 5 = 7 (3) - 5 = 2 (3)
        System.out.println(saveThePrisoner(7,19, 2) + " = 6");
        System.out.println(saveThePrisoner(3,7, 3) + " = 3"); // 7 - 1 = 6 (3) - 3 = 2 (3) - 2 = 0 (1)
    }

    public static int saveThePrisoner(int n, int m, int s) {
        int sweets = (m-1) % n;
        if (sweets + s > n) sweets -= n;
        return sweets + s;
    }
}
