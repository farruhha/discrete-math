package math;

public class GCD {

    //greatest common divisor by recursion (EUCLID THEOREM)
    public static void main(String[] args) {
        gcd(899, 493);
    }

    static void gcd(int x, int y){
        if (y == 0){
            System.out.println(x);
            return;
        }
        gcd(y,x%y);
    }
}
