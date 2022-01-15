package functional.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        /*Consumer<Integer> consumer = (i) -> System.out.println("printing: "+i.toString());
        consumer.accept(33);*/

        List<Integer> list1= Arrays.asList(1,2,3,4,5);
        list1.stream().forEach(i -> System.out.println("printing: "+ i));
    }
}
