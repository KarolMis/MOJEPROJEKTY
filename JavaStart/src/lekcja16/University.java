package lekcja16;

public class University {
    public static void main(String[] args) {
        System.out.println(Student.numberOfStudents);

        Student ada = new Student("ada,", "dupa","123");

        Student don = new Student("don", "eldupa", "090");


        System.out.println(Student.numberOfStudents);

    }
}
