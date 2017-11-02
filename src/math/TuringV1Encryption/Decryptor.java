package math.TuringV1Encryption;

public class Decryptor {
    private String decryptedMessage = "";

    public String getDescryptedMessage(int[]encryptedMsg){
        for (int i = 0; i < encryptedMsg.length; i++) {
            decryptedMessage +=(char)(encryptedMsg[i]/PrimeKey.key-17);
        }
        return decryptedMessage;
    }

}
