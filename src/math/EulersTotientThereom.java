package math;

public class EulersTotientThereom {
    public static void main(String[] args) {
       // System.out.println(gcd(15, 3));
        System.out.println(numberOfRelativePrimer(15));
    }

    static int numberOfRelativePrimer(int n) {
        int counter = 0;
        for (int i = 1; i < n; i++) {
            if (gcd(n, i) == 1) {
                counter++;
            }
        }
        return counter;
    }

    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }
}
