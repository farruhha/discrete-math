package math;

public class TwinPrimeConjecture {

//    There are infinitely many primes p such that p C 2 is
//    also a prime. In 1966 Chen showed that there are infinitely many primes p
//    such that p C 2 is the product of at most two primes. So the conjecture is
//    known to be almost true!
    public static void main(String[] args) {
        try {
            twinPrimeConjecture();
        }catch (Exception e){
            System.out.println(e.getMessage()+" End of number");
        }

    }

    static void twinPrimeConjecture() throws Exception {
        long number = 2;
        while (true) {
            if (isPrime(number) && isPrime(number+2)){
                System.out.println("This is prime: " +number);
            }
            number++;
        }
    }

    static boolean isPrime(long number) {
        for (long i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
