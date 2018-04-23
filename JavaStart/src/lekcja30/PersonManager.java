package lekcja30;

public class PersonManager {
    public static void main(String[] args) {
        PersonDatabase personDatabase = new PersonDatabase();

        personDatabase.add(new Person("simak","sdasd", "0912-9"));
        personDatabase.add(new Person("simak2","sdasd", "0912-9"));
        personDatabase.add(new Person("simak3","sdasd", "0912-9"));
        personDatabase.add(new Person("simak4","sdasd", "0912-9"));
        personDatabase.add(new Person("simak5","sdasd", "0912-9"));
        System.out.println(personDatabase);

        personDatabase.remove(new Person("simak3","sdasd", "0912-9"));
        System.out.println();
        System.out.println();

        System.out.println(personDatabase);

    }
}
