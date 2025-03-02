import java.util.Scanner;
class Practical2BVernamCipher
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		System.out.println("Enter the one-time-pad:");		
		String otp = scan.nextLine();
		otp = otp.toLowerCase();
		
		System.out.println("Enter the Plain Text:");
		String pt = scan.nextLine();
		pt = pt.toLowerCase();
		pt = pt.replace(" ","");
		
		String result="";
	
		for(int i=0; i<pt.length(); i++)
		{
			if(alphabet.indexOf(pt.charAt(i)) != -1)
			{
				int ptPosition = alphabet.indexOf(pt.charAt(i));
				int otpPosition = alphabet.indexOf(otp.charAt(i));
				int sum = ptPosition+otpPosition;
				int r = sum%26;
				result += alphabet.charAt(r);
			}
		}

		System.out.println("Encrypt: "+result);
	}
}