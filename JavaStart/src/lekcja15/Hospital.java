package lekcja15;

import java.util.Scanner;

public class Hospital {

    private Scanner scanner = new Scanner(System.in);
    private Patient[] patients = new Patient[10];
    private int counter = -1;

    public void addPatient(){
        System.out.println("Podaj name");
        String name = scanner.nextLine();
        System.out.println("Podaj surname");
        String surname = scanner.nextLine();
        System.out.println("Podaj pesel");
        String pesel = scanner.nextLine();
        counter++;
        if (counter<10) {
            patients[counter] = new Patient(name, surname, pesel);
        } else System.out.println("nie ma już miejsc!");

    }

    public void patientPrint(){
        for (Patient pat : patients) {
            System.out.println("name: " + pat.getName() + " surname: "+ pat.getSurname()+ " pesel: " + pat.getPesel());
        }


    }
}
