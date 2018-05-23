package lekcja41;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TextReader {

    public static void main(String[] args) throws IOException {
        final String FILE_NAME = "lekcja41.txt";
        BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
        List<String> words = new ArrayList<>();
        String tmp = null;

        while ((tmp = br.readLine()) != null) {
            words.addAll(Arrays.asList(tmp.split(" ")));
        }

        words = words.stream().map(s -> s.replaceAll(",", "").replaceAll("\\.", ""))
                .collect(Collectors.toList());

        long countSWords = words.stream().filter(s -> s.startsWith("s"))
                .peek(s -> System.out.print(s + " ")).count();
        System.out.println();

        long fiveLetters = words.stream().filter(s -> s.length() == 5)
                .peek(s -> System.out.print(s + " ")).count();
        System.out.println();

        System.out.println("Liczba wyrazów na 's': " + countSWords);
        System.out.println("Liczba wyrazów z 5 literami: " + fiveLetters);

        br.close();

    }
}
