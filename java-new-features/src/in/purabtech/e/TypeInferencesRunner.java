package in.purabtech.e;

import java.util.List;

public class TypeInferencesRunner {
    public static void main(String[] args) {

        //java compiler infers the type of the variable at compile time
        List<String> names1 = List.of("purab","test","name","jio");
        List<String> names2 = List.of("purab2","test2","name2","jio2");

        var names = List.of(names1,names2);

        names.stream().forEach(System.out::println);
    }
}
