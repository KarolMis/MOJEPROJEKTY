package lekcja16;

public class Student {
    private String name;
    private String surname;
    private String studentsID;
    public static int numberOfStudents = 0;

    public Student(String name, String surname, String studentsID) {
        this.name = name;
        this.surname = surname;
        this.studentsID = studentsID;
        numberOfStudents++;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStudentsID() {
        return studentsID;
    }

    public void setStudentsID(String studentsID) {
        this.studentsID = studentsID;
    }
}
