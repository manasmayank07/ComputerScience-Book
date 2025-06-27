public class FactorsComparison {
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);

        long start = System.currentTimeMillis();
        long factor = 2;
        while (factor <= n / factor) {
            if (n % factor == 0) System.out.println(factor);
            factor++;
        }
        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start) + "ms");
    }
}
