package math;

public class EulerTheory {

    // Conjecture. [Euler] The equation
    //a4 C b4 C c4 D d4
    //has no solution when a; b; c; d are positive integers

    public static void main(String[] args) {
        eulerConjecture();
    }

    private static void eulerConjecture() {
        for (long i = 1; i < 555555; i++) {
            for (long j = 1; j < 555555; j++) {
                for (long k = 1; k < 555555; k++) {
                    for (long l = 1; l < 555555; l++) {
                        System.out.println(i + " - " + j + " - " + j + " = " + l);
                        if (Math.pow(i, 4) + Math.pow(j, 4) + Math.pow(k, 4) == Math.pow(l, 4)) {
                            System.out.println("Solutions Hoorray :");
                            System.out.println(i + " - " + j + " - " + j + " = " + l);
                        }
                    }
                }
            }
        }
    }
}
