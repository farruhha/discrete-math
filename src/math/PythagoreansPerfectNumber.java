package math;

public class PythagoreansPerfectNumber {
    public static void main(String[] args) {
//        The Pythagoreans,
//        an ancient sect of mathematical mystics, said that a number is perfect if it equals the
//        sum of its positive integral divisors, excluding itself.
        System.out.println(isPerfect(10));
    }

    static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }
}
