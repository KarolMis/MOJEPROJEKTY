import adapter.*;

public class Main {
    public static void main(String[] args) {

        ContinentalSocket continentalSocket = new ContinentalSocket();

        ContinentalDevice continentalDevice = new ContinentalDevice() {
            @Override
            public void on() {
                System.out.println("gra jakaś muzyka");
            }
        };

        UKSocket ukSocket = new UKSocket();

        UKDevice ukDevice = new UKDevice() {
            @Override
            public void powerOn() {
                System.out.println("gra jakas angielska muzyka");
            }
        };

        TwoWayAdapter adapter = new TwoWayAdapter(ukDevice, continentalDevice);

        continentalSocket.plugIn(adapter);
        ukSocket.plugIn(adapter);

    }
}
