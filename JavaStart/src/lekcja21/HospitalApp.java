package lekcja21;

public class HospitalApp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Person doctor = new Doctor("maro", "git", "12345", "2312");
        Person nurse1 = new Nurse("zosia", "git", "2131", "20");
        Person nurse2 = new Nurse("maria", "git", "2131", "20");

        hospital.addWorker(doctor);
        hospital.addWorker(nurse1);
        hospital.addWorker(nurse2);

        System.out.println(hospital);
    }
}
