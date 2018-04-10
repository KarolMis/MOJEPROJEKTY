package lekcja21;

import java.util.Arrays;

public class Hospital {
    private Person[] workers = new Person[3];
    private int counter=0;

    public void addWorker(Person person){
        workers[counter] = person;
        counter++;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "workers=" + Arrays.toString(workers) +
                '}';
    }
}
