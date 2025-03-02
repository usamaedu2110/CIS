import java.io.*;
class Practical1ACeaserCipher
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream ptI = new FileInputStream("1A Plain Text.txt");
			FileInputStream ctI = new FileInputStream("1A Cipher Text.txt");
			FileOutputStream ctO = new FileOutputStream("1A Cipher Text.txt");
			FileOutputStream deO = new FileOutputStream("1A Decrypt Text.txt");	
		
			int i;

			i = ptI.read();
			while(i!=-1)
			{
				ctO.write(i+3);
				i = ptI.read();
			}

			int j;
		
			j = ctI.read();
			while(j!=-1)
			{
				deO.write(j-3);
				j = ctI.read();
			}
		}
		catch(Exception e)
		{
			System.out.println("Error Occurred");
		}
	}
}