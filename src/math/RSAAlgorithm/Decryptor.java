package math.RSAAlgorithm;

public class Decryptor {
    public static long computeMod = (Encoder.primeOne - 1) * (Encoder.primeTwo - 1);
    public static long privateKey = generatePrivateKeyD();

    public static long generatePrivateKeyD() {
        long publicKey = Encoder.publicKey;
        for (long i = 1; ; i++) {
            if ((publicKey * i - 1) % computeMod == 0) {
                return i;
            }
        }
    }

    public static long decryptor(long encode) {
        return (long) Math.pow(encode, privateKey) % Encoder.n;
    }
}
