package parralelstream.example;

import java.util.stream.IntStream;

public class ParralelStreamDemo {
    public static void main(String[] args) {
        long start=0;
        long end=0;
        start = System.currentTimeMillis();
        IntStream.range(1, 100).forEach(System.out::println);
        end = System.currentTimeMillis();

        System.out.println("Plain stream took time "+ (end-start));


        System.out.println("=================================================");
        start = System.currentTimeMillis();
        IntStream.range(1, 100).parallel().forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Parallel stream took time "+ (end-start));
    }
}
