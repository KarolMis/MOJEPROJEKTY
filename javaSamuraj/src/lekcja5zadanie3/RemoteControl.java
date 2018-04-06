package lekcja5zadanie3;

import java.util.Scanner;

public class RemoteControl {
    private Scanner scanner = new Scanner(System.in);

    private Button numericButton1 = new Button("1");
    private Button numericButton2 = new Button("2");
    private Button numericButton3 = new Button("3");
    private Button numericButton4 = new Button("4");
    private Button numericButton5 = new Button("5");
    private Button numericButton6 = new Button("6");
    private Button numericButton7 = new Button("7");
    private Button numericButton8 = new Button("8");
    private Button numericButton9 = new Button("9");
    private Button numericButton0 = new Button("0");

    private Button volumePlus = new Button("volumePlus");
    private Button volumeMinus = new Button("volumeMinus");

    private Button canalPlus = new Button("canalPlus");
    private Button canalMinus = new Button("canalMinus");

    private Button off = new Button("off");

    public void controlLoop(){
        System.out.println("pyk!");
        String button = "";
        while (!button.equals("off")){
            printInfo();
            button = scanner.nextLine();

            if(button.equals(canalPlus.getName())||button.equals(canalMinus.getName()) || numericButton0.getName().equals(button) || numericButton1.getName().equals(button)|| numericButton2.getName().equals(button)|| numericButton3.getName().equals(button)|| numericButton4.getName().equals(button)|| numericButton5.getName().equals(button)|| numericButton6.getName().equals(button)|| numericButton7.getName().equals(button)|| numericButton8.getName().equals(button)|| numericButton9.getName().equals(button)){
                System.out.println("zmieniono kanał!");
            } else if (button.equals(volumeMinus.getName()) || button.equals(volumePlus.getName())){
                System.out.println("zmieniono głośnośc");
            } else if (button.equals(off.getName())){
                System.out.println("PYK");
            } else System.out.println("nie ma takiego przycisku");
        }
    }
    public static int howOld(final String herOld) {

        return Character.getNumericValue(herOld.charAt(0));

    }
    public void printInfo(){
        System.out.println(off.getName());
        System.out.println("   "+ numericButton1.getName() + "      " + numericButton2.getName() + "     " + numericButton3.getName());
        System.out.println("   "+ numericButton4.getName() + "      " + numericButton5.getName() + "     " + numericButton6.getName());
        System.out.println("   "+ numericButton7.getName() + "      " + numericButton8.getName() + "     " + numericButton9.getName());
        System.out.println(canalPlus.getName()+" " + numericButton0.getName()+" " + volumePlus.getName());
        System.out.println(canalMinus.getName()+"      " + volumeMinus.getName());
    }

}
