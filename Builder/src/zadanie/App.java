package zadanie;

public class App {
    public static void main(String[] args) {
        FlightLeg flightLeg = new FlightLeg.FlightLegBuilder("Kraków", "Warszawa").build();
        System.out.println(flightLeg);
    }
}
