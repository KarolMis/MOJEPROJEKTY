package lekcja36;


import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class IteratorImp {

    public static void main(String[] args) {
        String person1 = "Marek Nowak - 20";
        String person2 = "Marek ANowak - 20";
        String person3 = "Marek BNowak - 20";
        String person4 = "Marek FNowak - 20";
        String person5 = "Marek HNowak - 20";

        Map<String, String> map = new TreeMap<>();

        map.put("Nowak",person1);
        map.put("HNowak",person5);
        map.put("FNowak",person4);
        map.put("BNowak",person3);
        map.put("ANowak",person2);

        Iterator<String> iterator = map.values().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
