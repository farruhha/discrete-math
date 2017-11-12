package math;

public class WaterJugProblems {
    public static void main(String[] args) {

        //Is it possible to get 3 liter water by 21 and 26 liter water jugs
        //Answer is yes since 3 is multiple of gcd (26,21)
        System.out.println(proving(21,26));
    }

    static boolean proving(int a, int b) {
        int s = b;
        int t = a * (-1);
        while (true) {
            if ((21 * s + 26 * t) == 3) {
                return true;
            }
            s += b;
            t += a;

        }
    }


}
