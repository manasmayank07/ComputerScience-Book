public class Kary {
    public static void main(String[] args) {
        long i = Long.parseLong(args[0]);
        int k = Integer.parseInt(args[1]);
        String digits = "0123456789ABCDEF";
        StringBuilder result = new StringBuilder();

        if (k < 2 || k > 16) {
            System.out.println("Base k must be between 2 and 16");
            return;
        }

        do {
            result.insert(0, digits.charAt((int)(i % k)));
            i /= k;
        } while (i > 0);

        System.out.println(result.toString());
    }
}
