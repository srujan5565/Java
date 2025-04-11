import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.util.Scanner;

public class BlowFish {
    public static void main(String[] args) throws Exception {
        KeyGenerator kgen = KeyGenerator.getInstance("Blowfish");
        Cipher cipher = Cipher.getInstance("Blowfish");
        SecretKey skey = kgen.generateKey();
        byte[] raw = skey.getEncoded();
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "Blowfish");
        
        // Encrypt the input text
        cipher.init(Cipher.ENCRYPT_MODE, skey);
        System.out.print("Input your message: ");
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        byte[] encrypted = cipher.doFinal(inputText.getBytes());
        String encryptedBase64 = Base64.getEncoder().encodeToString(encrypted);
        
        // Decrypt the encrypted text
        cipher.init(Cipher.DECRYPT_MODE, skey);
        byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(encryptedBase64));
        
        System.out.println("\nEncrypted text: " + encryptedBase64);
        System.out.println("\nDecrypted text: " + new String(decrypted));
        
        scanner.close();
    }
}
