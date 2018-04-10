package lekcja19;

public class Student {
    String firstName;
    String lastName;
    public Student(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj){
            return true;
        }
        else if(obj == null){
            return false;
        }
        else if(!(obj instanceof Student)){
            return false;
        }

        Student s = (Student) obj;
// sprawdzenie kolejnych pól klasy, uważając na wartości null
        if(this.firstName == s.firstName && this.lastName == s.lastName)
            return true;
        if(this.firstName != null) {
            if(!this.firstName.equals(s.firstName))
                return false;
        } else if(this.firstName == null && s.firstName != null)
            return false;
        if (this.lastName != null) {
            if(!this.lastName.equals(s.lastName))
                return false;
        } else if(this.lastName == null && s.lastName != null)
            return false;
        //jeśli dojdziemy do tego miejsca to obiekty są równe
        return true;
    }

    @Override
    public String toString() {
        return lastName + firstName;
    }
}