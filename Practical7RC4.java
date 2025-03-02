import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class Practical7RC4
{
	public static void main(String[] args)
	{
		try
		{
			Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Key:");
		String key = scan.nextLine();

		System.out.println("Enter the Plain Text:");
		String pt = scan.nextLine();

		SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), "RC4");

		Cipher encryptCipher = Cipher.getInstance("RC4");
		encryptCipher.init(Cipher.ENCRYPT_MODE, keySpec);
		byte[] encryptBytes = encryptCipher.doFinal(pt.getBytes());
		String encrypt = new String(encryptBytes);

		Cipher decryptCipher = Cipher.getInstance("RC4");
		decryptCipher.init(Cipher.DECRYPT_MODE, keySpec);
		byte[] decryptBytes = decryptCipher.doFinal(encryptBytes);
		String decrypt = new String(decryptBytes);

		System.out.println("Encrypted: "+encrypt+"\nDecrypted: "+decrypt);
		}
		catch(Exception e)
		{
		}
	}
}