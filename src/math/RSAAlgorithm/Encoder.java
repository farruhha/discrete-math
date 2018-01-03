package math.RSAAlgorithm;

import math.EulersTotientThereom;

import java.util.concurrent.ThreadLocalRandom;

public class Encoder {
    //We have randomly picked two prime numbers// Usually it is very large.
    //For the sake of checking, they are small now
    public static final long primeOne = 7;
    public static long primeTwo = 11;
    //This is used as a pair with public key
    public static long n = primeOne * primeTwo;
    public static long publicKey = generatePublicKeyE();


    public static long generatePublicKeyE() {
        long phi = (primeOne - 1) * (primeTwo - 1);
        while (true) {
            long e = ThreadLocalRandom.current().nextLong();
            if (EulersTotientThereom.gcdLong(phi, e) == 1) {
                return e;
            }
        }

    }

    public static long encoder(long code) {
        return (long) Math.pow(code, publicKey) % n;
    }

}
