import java.util.Scanner;
import java.security.SecureRandom;
import java.math.BigInteger;

class Practical6RSA
{
	BigInteger e, d;
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		SecureRandom random = new SecureRandom();
		
		int bitLength = 16;

		Practical6RSA pr = new Practical6RSA();

		BigInteger p = BigInteger.probablePrime(bitLength/2, random);
		BigInteger q = BigInteger.probablePrime(bitLength/2, random);
		
		System.out.println("The value of P and Q are "+p+" and "+q);

		BigInteger n = p.multiply(q);
		
		BigInteger phi = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
		
		pr.e = BigInteger.probablePrime(bitLength/2, random);
		
		while(phi.gcd(pr.e).compareTo(BigInteger.ONE)>0)
		{
			pr.e = BigInteger.probablePrime(bitLength / 2, random);
		}
		
		pr.d = pr.e.modInverse(phi);

		System.out.println("Enter the message:");
		BigInteger message = scan.nextBigInteger();

		BigInteger encrypt = message.modPow(pr.e,n);
		System.out.println("Encrypted: "+encrypt);

		BigInteger decrypt = encrypt.modPow(pr.d,n);
		System.out.println("Decrypted: "+decrypt);

		
	}
}