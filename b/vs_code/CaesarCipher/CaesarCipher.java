package vs_code.CaesarCipher;
import java.io.*;

class CaesarCipher {
    public static void main(String args[]) {
        int i;
        try {
            File f1 = new File("1.txt");
            File f2 = new File("2.txt");
            File f3 = new File("3.txt");
            FileInputStream fis = new FileInputStream(f1);
            FileOutputStream fos = new FileOutputStream(f2);
            FileOutputStream os = new FileOutputStream(f3);
            while ((i = fis.read()) != -1) {
                fos.write(i);
                os.write(i + 6);
            }
            System.out.println("File copied");
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}