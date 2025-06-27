public class RandomWalker {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int x = 0, y = 0, steps = 0;

        while (Math.abs(x) <= n && Math.abs(y) <= n) {
            double r = Math.random();
            if (r < 0.25) x++;           // east
            else if (r < 0.50) x--;      // west
            else if (r < 0.75) y++;      // north
            else y--;                    // south
            steps++;
        }

        System.out.println("Exited after " + steps + " steps.");
    }
}
