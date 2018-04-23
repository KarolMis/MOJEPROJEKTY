package lekcja30;

import java.util.Arrays;

public class PersonDatabase {
    private final int INITIAL_CAPACITY = 1;
    private Person[] people;
    private int emptyPlace;

    public PersonDatabase() {
        people = new Person[INITIAL_CAPACITY];
        emptyPlace = 0;
    }

    public void add(Person p) {
        if (emptyPlace == people.length) {
            people = Arrays.copyOf(people, people.length * 2);
        }
        people[emptyPlace] = p;
        emptyPlace++;
    }

    public void remove(Person p) {
        if (p == null)
            return;

        final int NOT_FOUND = -1;
        int found = NOT_FOUND;
        int i = 0;
        while (i < people.length && found == NOT_FOUND) {
            if (p.equals(people[i])) {
                found = i;
            } else {
                i++;
            }
        }

        if (found != NOT_FOUND) {
            System.arraycopy(people, found + 1, people, found, people.length - found - 1);
            emptyPlace--;
        }
    }

    public Person get(int index) throws ArrayIndexOutOfBoundsException {
        if (index >= emptyPlace || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Błędny parametr");
        }
        return people[index];
    }

    public int size() {
        return emptyPlace;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PersonsDatabase size: " + size());
        sb.append("\n");
        for (int i = 0; i < emptyPlace; i++) {
            sb.append(people[i].toString());
            sb.append("\n");
        }
        return sb.toString();
    }

}
