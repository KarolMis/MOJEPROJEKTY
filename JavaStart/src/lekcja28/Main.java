package lekcja28;

import java.io.*;
import java.math.BigInteger;

public class Main {
    private static final String FILE = "lekcja28file";

    public static void main(String[] args) {
        int a=0, b=0, c = 0;
        BigInteger aBig = null, bBig = null;

        try (FileReader fileReader = new FileReader(FILE);
        BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            a = Integer.parseInt(bufferedReader.readLine());
            b = Integer.parseInt(bufferedReader.readLine());
            c = Integer.parseInt(bufferedReader.readLine());
            aBig = new BigInteger(bufferedReader.readLine());
            bBig = new BigInteger(bufferedReader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("a+b+c = " + (a+b+c));
        assert aBig != null;
        assert bBig != null;
        System.out.println("aBig+bBig = " + aBig.add(bBig));

    }


}
