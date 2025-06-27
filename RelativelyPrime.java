public class RelativelyPrime {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (gcd(i, j) == 1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
