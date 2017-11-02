package math.TuringV1Encryption;

public class Test {
    public static void main(String[] args) {

        Encryptor encryptor = new Encryptor();
        encryptor.receiveAndEncrypt("hello");
        //Encryption of message
        System.out.println(encryptor.toString());

        //decryption of the message
        Decryptor decryptor = new Decryptor();
        System.out.println(decryptor.getDescryptedMessage(encryptor.getEncryptedMessage()));

        System.out.println("Key for encryption:");
        int [] encs = encryptor.getEncryptedMessage();
        Intercepter.interceptKey(encs[0],encs[1]);
    }
}
