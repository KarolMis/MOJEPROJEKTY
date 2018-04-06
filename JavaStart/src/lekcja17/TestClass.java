package lekcja17;

public class TestClass {
    public static void main(String[] args) {
        Tire tire = new Tire();
        tire.id = 1;
        tire.model = "mishelin";
        tire.name = "opona";
        tire.serialNumber = "wz-123124";
        tire.h = 123.21;
        tire.w = 21;

        System.out.println(tire.id+ " " + tire.name+ " " +tire.model+ " " +tire.serialNumber+ " " +tire.h+ " " +tire.w);
    }
}
