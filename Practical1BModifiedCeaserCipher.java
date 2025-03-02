import java.util.Scanner;
class Practical1BModifiedCeaserCipher
{
	public static void main(String[] args)
	{
		String encrypt="",decrypt="";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the shift:");
		int k = scan.nextInt();
		scan.nextLine();

		System.out.println("Enter the Plain Text:");
		String pt = scan.nextLine();
		
		for(int i=0;i<pt.length();i++)
		{
			int r= ((int)pt.charAt(i)+k)%256;
			encrypt += (char) r;
		}
		System.out.println("Cipher Text: "+encrypt);

		for(int j=1;j<26;j++)
		{
			String dcy = "";
			for(int i=0;i<encrypt.length();i++)
			{
				int d = ((int)encrypt.charAt(i)-j+256)%256;
				decrypt += (char) d;
				dcy += (char) d;
			}
			System.out.println(j);
			System.out.println("Decrypted Text: "+dcy);
			dcy = "";
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
			}
		}
		

		scan.close();
	}
}