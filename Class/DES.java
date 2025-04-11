import java.security.spec.KeySpec;
import javax.crypto.*;
import javax.crypto.spec.DESedeKeySpec;
import java.util.Base64;
import java.util.Scanner;

public class DES {
    private static final String UNICODE_FORMAT = "UTF8";
    private static final String DESEDE_ENCRYPTION_SCHEME = "DESede";
    private static final String ENCRYPTION_KEY = "ThisIsSecretEncryptionKey";
    private Cipher cipher;
    private SecretKey key;

    public DES() throws Exception {
        byte[] keyAsBytes = ENCRYPTION_KEY.getBytes(UNICODE_FORMAT);
        KeySpec keySpec = new DESedeKeySpec(keyAsBytes);
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DESEDE_ENCRYPTION_SCHEME);
        key = keyFactory.generateSecret(keySpec);
        cipher = Cipher.getInstance(DESEDE_ENCRYPTION_SCHEME);
    }

    public String encrypt(String unencryptedString) throws Exception {
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] plainText = unencryptedString.getBytes(UNICODE_FORMAT);
        byte[] encryptedText = cipher.doFinal(plainText);
        return Base64.getEncoder().encodeToString(encryptedText);
    }

    public String decrypt(String encryptedString) throws Exception {
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] encryptedText = Base64.getDecoder().decode(encryptedString);
        byte[] plainText = cipher.doFinal(encryptedText);
        return new String(plainText, UNICODE_FORMAT);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String stringToEncrypt = sc.next();
        DES myEncryptor = new DES();
        String encrypted = myEncryptor.encrypt(stringToEncrypt);
        String decrypted = myEncryptor.decrypt(encrypted);
        System.out.println("\nString To Encrypt: " + stringToEncrypt);
        System.out.println("\nEncrypted Value : " + encrypted);
        System.out.println("\nDecrypted Value : " + decrypted);
        }
    }

