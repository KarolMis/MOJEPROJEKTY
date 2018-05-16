package lekcja34;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();

        company.addEmployee("Adam", "Kowalski", 2000);
        company.addEmployee("Adam", "Nowak", 3000);
        company.addEmployee("Marcin", "Kowalski", 2500);
        //System.out.println(company.getEmployee("Adam", "Kowalski"));
        System.out.println("_________________________________________________________");
        System.out.println("_________________________________________________________");
        System.out.println("_________________________________________________________");
        System.out.println(company.employees.values());

    }
}
/*Aplikacja powinna posiadać 3 opcje:

        Dodanie nowego pracownika
        Wyszukanie informacji o pracowniku na podstawie imienia i nazwiska po czym wyświetlenie danych pracownika na ekrani (imię, nazwisko, wypłata)
        Wyjście z programu*/