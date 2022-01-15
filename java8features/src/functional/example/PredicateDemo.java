package functional.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {



    public static void main(String[] args) {

        Predicate<Integer> predicate = t -> t%2==0;
        System.out.println(predicate.test(7));

        List<Integer> list1= Arrays.asList(1,2,3,4,5);
        list1.stream().filter(predicate).forEach(i -> System.out.println("printing even: "+ i));
    }
}
