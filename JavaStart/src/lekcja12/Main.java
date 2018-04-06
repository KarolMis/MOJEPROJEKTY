package lekcja12;

public class Main {
    public static void main(String[] args) {
        int[] tab1 = {1,2,3,4};
        int[] tab2 = {1,2,3,4};

        int sum = 0;
        for (int i = 0; i < tab1.length; i++) {
            sum = sum + tab1[i] + tab2[i];
        }

        System.out.println(sum);

        System.out.println(0 % 2);
    }
}
