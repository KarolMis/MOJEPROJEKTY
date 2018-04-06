package lekcja13;

public class Main {
    public static void main(String[] args) {
        /*
        double[][] tab = new double[3][];
        double[] line0 = {1.0, 1.5, 2.0};
        double[] line1 = {1.5, 2.0, 2.5};
        double[] line2 = {2.0, 2.5, 3.0};

        tab[0] = line0;
        tab[1] = line1;
        tab[2] = line2;
        tak szybciej!!
         */

        double[][] tab = new double[3][3];
        tab[0][0] = 1.0;
        tab[0][1] = 1.5;
        tab[0][2] = 2.0;
        tab[1][0] = 1.5;
        tab[1][1] = 2.0;
        tab[1][2] = 2.5;
        tab[2][0] = 2.0;
        tab[2][1] = 2.5;
        tab[2][2] = 3.0;

        System.out.println((tab[0][0]*tab[1][1]*tab[2][2]) + (tab[0][2]*tab[1][1]*tab[2][0]));
        System.out.println((tab[0][1]*tab[1][1]*tab[2][1]) + (tab[1][0]*tab[1][1]*tab[1][2]));
        System.out.println(tab[0][0] + tab[0][1] + tab[0][2] + tab[1][0] + tab[1][2] + tab[2][2] + tab [2][1] + tab[2][0]);
    }
}
