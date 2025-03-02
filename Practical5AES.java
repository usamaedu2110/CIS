import javax.crypto.SecretKey;
import javax.crypto.KeyGenerator;
import javax.crypto.Cipher;
import java.util.Scanner;
import java.util.Base64;

class Practical5AES
{
	public static void main(String[] args)
	{
		try
		{
			SecretKey key = KeyGenerator.getInstance("AES").generateKey();
		
			Scanner scan = new Scanner(System.in);
		
			System.out.println("Enter the Plain Text:");
			String pt = scan.nextLine();

			Cipher encryptCipher = Cipher.getInstance("AES");
			encryptCipher.init(Cipher.ENCRYPT_MODE, key);
			byte[] encryptBytes = encryptCipher.doFinal(pt.getBytes());
			String encrypt = Base64.getEncoder().encodeToString(encryptBytes);
			System.out.println("Encrypted: "+encrypt);
	
				
			Cipher decryptCipher = Cipher.getInstance("AES");
			decryptCipher.init(Cipher.DECRYPT_MODE, key);
			byte[] decryptBytes = decryptCipher.doFinal(Base64.getDecoder().decode(encrypt));
			String decrypt = new String(decryptBytes);
			System.out.println("Decrypted: "+decrypt);
		}
		catch(Exception e)
		{
		}

	}
}