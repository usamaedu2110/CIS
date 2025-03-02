import java.util.Scanner;
class Practical3DiffieHellmans
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two larger prime number:");
		System.out.println("n=");
		int n = scan.nextInt();
		System.out.println("g=");
		int g = scan.nextInt();

		System.out.println("Enter A's random number:");
		int x = scan.nextInt();
		
		System.out.println("Enter B's random number:");
		int y = scan.nextInt();
		
		int A = ((int)Math.pow(g,x))%n;
		System.out.println("A= "+A);
		int B = ((int)Math.pow(g,y))%n;
		System.out.println("B= "+B);
		
		int k1 = ((int)Math.pow(B,x))%n;
		int k2 = ((int)Math.pow(A,y))%n;
		
		System.out.println("The A's key is: "+k1);
		System.out.println("The B's key is: "+k2);

		if(k1==k2)
		{
			System.out.println("Successfull");
		}
		else
		{
			System.out.println("Failed");
		}

	}
}