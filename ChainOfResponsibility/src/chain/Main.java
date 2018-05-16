package chain;

import chain.message.Message;
import chain.officer.Officer;

public class Main {

    public static void main(String[] args) {

        Message message = new Message("Atakować!");

        Officer officer = new Officer();
//        officer.setCaptain(true);
//        officer.setSergeant(true);

        officer.receiveMessage(message);

    }

}