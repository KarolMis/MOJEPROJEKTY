package lekcja25bubblesort;

public class Main {
    public static void main(String[] args) {
        int[] tab = {2,1,3,6,12,23,43,90,4,7};

        Sortable sortable = new Sortable() {
            @Override
            public int[] sort(int[] tab) {
                for (int i = tab.length; i > 1; i--) {
                    for (int j = 0; j < tab.length-1; j++) {
                        if(tab[j] > tab[j+1]){
                            int numb = tab[j+1];
                            tab[j+1] = tab[j];
                            tab[j] = numb;
                        }
                    }
                }
                return tab;
            }
        };
        print(tab);
        sortable.sort(tab);
        print(tab);
    }


    private static void print(int[] tab){
        for (int ints: tab) {
            System.out.print(ints + " ");
        }
        System.out.println();
    }
}
