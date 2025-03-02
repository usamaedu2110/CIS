package vs_code;
import java.math.*;
import java.security.*;

public class RSA {
    BigInteger p, q, n, d, e, ph, t;
    SecureRandom r;

    public RSA() {
        r = new SecureRandom();
        p = new BigInteger(2, 0, r);
        q = new BigInteger(2, 0, r);
        System.out.println("Prime numbers p and q are " + p.intValue() + ", " + q.intValue());
        n = p.multiply(q);
        ph = (p.subtract(new BigInteger("1")));
        ph = ph.multiply(q.subtract(new BigInteger("1")));
        e = new BigInteger("2");
        while (ph.gcd(e).intValue() > 1 || e.compareTo(ph) != -1) {
            e = e.add(new BigInteger("1"));
            d = e.modInverse(ph);
            System.out.println("Public key is (" + n.intValue() + "," + e.intValue() + ")");
            System.out.println("Private key is (" + n.intValue() + "," + d.intValue() + ")");
            BigInteger msg = new BigInteger("15");
            System.out.println("\nMessage is: " + msg);
            BigInteger enmsg = encrypt(msg, e, n);
            System.out.println("\nEncrypted Message is: " + enmsg.intValue());
            BigInteger demsg = decrypt(msg, d, n);
            System.out.println("\nDecrypted Message is: " + demsg.intValue());
        }
    }

    BigInteger encrypt(BigInteger msg, BigInteger e, BigInteger n) {
        return msg.modPow(e, n);
    }

    BigInteger decrypt(BigInteger msg, BigInteger d, BigInteger n) {
        return msg.modPow(d, n);
    }

    public static void main(String args[]) {
        RSA r = new RSA();
    }
}