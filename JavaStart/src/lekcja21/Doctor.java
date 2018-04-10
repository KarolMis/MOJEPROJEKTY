package lekcja21;

public class Doctor extends Person {
    private String bonus;

    public Doctor(String firstname, String lastname, String salary, String bonus) {
        super(firstname, lastname, salary);
        this.bonus = bonus;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "firstname='" + getFirstname() + '\'' +
                ", lastname='" + getLastname() + '\'' +
                ", salary='" + getSalary() + '\'' +
                "bonus='" + bonus + '\'' +
                '}';
    }
}
