package lekcja21;

public class Nurse extends Person{
    private String overtime;

    public Nurse(String firstname, String lastname, String salary, String overtime) {
        super(firstname, lastname, salary);
        this.overtime = overtime;
    }

    public String getOvertime() {
        return overtime;
    }

    public void setOvertime(String overtime) {
        this.overtime = overtime;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "firstname='" + getFirstname() + '\'' +
                ", lastname='" + getLastname() + '\'' +
                ", salary='" + getSalary() + '\'' +
                "overtime='" + overtime + '\'' +
                '}';
    }
}
