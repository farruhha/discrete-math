package math.TuringV1Encryption;

public class Encryptor {

    private int[] encryptedMessage;

    public void receiveAndEncrypt(String plainText) {
        encryptedMessage = new int[plainText.length()];
        for (int i = 0; i < plainText.length(); i++) {
            encryptedMessage[i] = (((int) plainText.charAt(i)) + 17) * PrimeKey.key;
        }

    }

    public int[] getEncryptedMessage() {
        return encryptedMessage;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < encryptedMessage.length - 1; i++) {
            stringBuilder.append(encryptedMessage[i] + ",");
        }
        stringBuilder.append(encryptedMessage[encryptedMessage.length - 1] + "]");
        return stringBuilder.toString();
    }
}
