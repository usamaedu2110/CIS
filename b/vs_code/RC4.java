package vs_code;
class RC4 {
    String pt;
    static char cipher[];

    RC4(String pt, int[] key) {
        this.pt = pt;
        int s[] = new int[255];
        cipher = new char[pt.length()];
        for (int i = 0; i < s.length; i++) {
            s[i] = i;
        }
        int i = 0;
        int j = 0;
        for (int k = 0; k < pt.length(); k++) {
            int modk = (k % key.length);
            int kc = key[modk];
            j = (s[i] + j + kc) % 256 + 1;
            int temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            int sc = (s[i] + s[j]) % 256;
            int ck = s[sc];
            cipher[k] = (char) (ck ^ (int) pt.charAt(k));
            i = i + 1;
        }
    }

    public static void main(String args[]) {
        int k[] = { 1, 2, 3, 4, 5 };
        String original = "KC College";
        System.out.println("Value is: " + original);
        new RC4(original, k);
        for (int i = 0; i < cipher.length; i++) {
            System.out.println(" " + cipher[i]);
        }
    }
}