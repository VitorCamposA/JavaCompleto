package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {
        Consumer<Object> print = System.out::print;

        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
        langs.forEach(print);


        String[] maisLangs = {"Python ","Lisp ","Perl ", "Go \n"};
        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 0, 4).forEach(print);


        ArrayList<String> outrasLangs = new ArrayList<>();
        outrasLangs.add("C ");
        outrasLangs.add("PHP ");
        outrasLangs.add("Kotlin \n");
        outrasLangs.parallelStream().forEach(print);
        outrasLangs.forEach(print);

        //Stream.generate(() -> "a").forEach(print);
        //Stream.iterate(0, n -> n + 1).forEach(print);
    }
}
