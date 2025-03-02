import java.util.Scanner;
class Practical1CMonoAlphabetic
{
	public static void main(String[] args)
	{
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the key:");
		String key = scan.nextLine();
		key = key.toLowerCase();
		
		System.out.println("Enter the Plain Text:");
		String pt = scan.nextLine();
		pt = pt.toLowerCase();

		String alphabet1 = "";

		String encrypt="", decrypt="";
		
		for(int i=0;i<key.length();i++)
		{
			if(alphabet1.contains(String.valueOf(key.charAt(i))))
			{
				
			}
			else
			{
				alphabet1 += key.charAt(i);
			}
		}
		
		for(int i=0;i<26;i++)
		{
			if(alphabet1.contains(String.valueOf(alphabet.charAt(i))))
			{
			}
			else
			{
				alphabet1 += alphabet.charAt(i); 
			}
		}
		
		for(int i=0;i<pt.length();i++)
		{
			int position = alphabet.indexOf(pt.charAt(i));
			encrypt += alphabet1.charAt(position);
		}
		System.out.println("Encrypt: "+encrypt);
		
		for(int i=0; i<encrypt.length();i++)
		{
			int position = alphabet1.indexOf(encrypt.charAt(i));
			decrypt += alphabet.charAt(position);
		}
		System.out.println("Decrypt: "+decrypt);
	}
}