import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BumpsTheRoad {

    public static String bumps(final String road) {
        return road.chars().filter(ch -> ch =='n').count()>15? "Car Dead" : "Woohoo!";
    }
}

class XO {

    public static boolean getXO (String str) {

        return str.chars().filter(ch -> ch =='O' || ch =='o').count() == str.chars().filter(ch -> ch =='x' || ch == 'X').count();

    }
}