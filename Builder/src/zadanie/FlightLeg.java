package zadanie;

public class FlightLeg {
    private String from;
    private String to;
    private int price;
    private boolean delayed = false;

    private FlightLeg(FlightLegBuilder flightLegBuilder) {
        this.from = flightLegBuilder.from;
        this.to = flightLegBuilder.to;
        this.price = flightLegBuilder.price;
        this.delayed = flightLegBuilder.delayed;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int getPrice() {
        return price;
    }

    public boolean isDelayed() {
        return delayed;
    }

    public FlightLeg setPrice(int price) {
        this.price = price;
        return this;
    }

    public FlightLeg setDelayed(boolean delayed) {
        this.delayed = delayed;
        return this;
    }

    @Override
    public String toString() {
        return "FlightLeg{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", price=" + price +
                ", delayed=" + delayed +
                '}';
    }

    public static class FlightLegBuilder{

        private String from;
        private String to;
        private int price;
        private boolean delayed = false;

        public FlightLegBuilder(String from, String to){
            this.from = from;
            this.to = to;
            this.delayed = false;
        }

        public FlightLegBuilder price(int price){
            this.price= price;
            return this;
        }

        public FlightLeg build(){
            if(this.price==0) {
                throw new IllegalStateException("Brak wymaganego pola - cena");
            }

            return new FlightLeg(this);
        }
    }
}
