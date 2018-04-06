package odcinek5tablice;

import java.util.Scanner;

public class SredniaZOcen {
    public static void main(String[] args) {
        double[] tab = new double[5];

        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 5; i++) {
            System.out.print("podaj ocene(UZYWAJAC PRZECINKÓW!!): ");
            tab[i] = scanner.nextDouble();
        }
        double average = 0;

        for (double x: tab) {
            average+=x;
        }

        System.out.println(average/5.0);

    }
}
