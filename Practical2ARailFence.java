import java.util.Scanner;
class Practical2ARailFence
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
			
		System.out.println("Enter the Plain Text:");
		String pt = scan.nextLine();
		
		String result="";
		
		for(int i=0; i<pt.length(); i++)
		{
			result+=pt.charAt(i);
			i+=1;
		}
		
		for(int i=1; i<pt.length(); i++)
		{
			result+=pt.charAt(i);
			i+=1;
		}
		
		System.out.println("Encrypt: "+result);
	}
}