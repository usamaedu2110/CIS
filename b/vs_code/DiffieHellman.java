package vs_code;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.util.*;
import java.math.BigInteger.*;
import java.math.*;

class DiffieHellman {
    public static void main(String args[]) {
        BigInteger a, b, k1, k2, x, y, g, n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A's prime number");
        n = s.nextBigInteger();
        System.out.println("Enter B's prime number");
        g = s.nextBigInteger();
        System.out.println("Enter A's secret key");
        x = s.nextBigInteger();
        System.out.println("This key is sent to B");
        System.out.println("Enter B's secret key");
        y = s.nextBigInteger();
        System.out.println("This key is sent to A");
        a = g.modPow(x, n);
        b = g.modPow(y, n);
        k1 = b.modPow(x, n);
        k2 = a.modPow(y, n);
        System.out.println("A's key is " + k1);
        System.out.println("B's key is " + k2);
    }
}