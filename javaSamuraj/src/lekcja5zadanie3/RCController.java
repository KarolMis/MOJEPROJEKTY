package lekcja5zadanie3;

import java.util.Scanner;

public class RCController {
    private Scanner scanner = new Scanner(System.in);
    RemoteControl remoteControl = new RemoteControl();

    public void init(){
        String init = scanner.nextLine();
        if(init.equals("on")) {
            remoteControl.controlLoop();
        }

    }
}
