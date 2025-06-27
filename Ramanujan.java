public class Ramanujan {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int a = 1; a <= n; a++) {
            for (int b = a; b <= n; b++) {
                int sum1 = a*a*a + b*b*b;
                for (int c = a+1; c <= n; c++) {
                    for (int d = c; d <= n; d++) {
                        int sum2 = c*c*c + d*d*d;
                        if (sum1 == sum2 && (a != c || b != d)) {
                            System.out.println(sum1 + " = " + a + "^3 + " + b + "^3 = " + c + "^3 + " + d + "^3");
                        }
                    }
                }
            }
        }
    }
}
