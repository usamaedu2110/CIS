import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

class Practical8Blowfish
{
	public static void main(String[] args)
	{
		try
		{
			Scanner scan = new Scanner(System.in);
		
			System.out.println("Enter the Plain Text:");
			String pt = scan.nextLine();
		
			SecretKey key = KeyGenerator.getInstance("Blowfish").generateKey();

			Cipher encryptCipher = Cipher.getInstance("Blowfish");
			encryptCipher.init(Cipher.ENCRYPT_MODE, key);
			byte[] encryptBytes = encryptCipher.doFinal(pt.getBytes());
			String encrypt = new String(encryptBytes);

			Cipher decryptCipher = Cipher.getInstance("Blowfish");
			decryptCipher.init(Cipher.DECRYPT_MODE, key);
			byte[] decryptBytes = decryptCipher.doFinal(encryptBytes);
			String decrypt = new String(decryptBytes);

			System.out.println("Encrypted: "+encrypt+"\nDecryped: "+decrypt);
		
		}
		catch(Exception e)
		{
		}
	
	}
}