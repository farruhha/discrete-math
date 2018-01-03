package math.RSAAlgorithm;

import java.util.Scanner;

public class Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longString = scanner.nextLine();
        long[]encryptedMessage = new long[longString.length()];

        for (int i = 0; i < longString.length() ; i++) {
            encryptedMessage[i] = Encoder.encoder(longString.charAt(i));
        }

        for (int i = 0; i < encryptedMessage.length; i++) {
            System.out.println(encryptedMessage[i]);
        }
    }
}
