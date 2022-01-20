package stream;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BiFuncationDemo implements BiFunction<List<Integer>, List<Integer>, List<Integer>> {

    @Override
    public List<Integer> apply(List<Integer> list1, List<Integer> list2) {
        return Stream.of(list1,list2)
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        BiFunction biFunction= new BiFuncationDemo();
        List<Integer> list1= Stream.of(1, 3,6, 8,9,10,19).collect(Collectors.toList());
        List<Integer> list2= Stream.of(11, 3,43, 8,32,11,19).collect(Collectors.toList());
        System.out.println("traditional approch:"+biFunction.apply(list1,list2));

        BiFunction<List<Integer>,List<Integer>,List<Integer>> biFunction1=new BiFunction<List<Integer>, List<Integer>, List<Integer>>() {

            @Override
            public List<Integer> apply(List<Integer> l1, List<Integer> l2) {
                return Stream.of(l1,l2)
                        .flatMap(List::stream)
                        .distinct()
                        .collect(Collectors.toList());
            }
        };
        System.out.println("annonymous impl:"+biFunction1.apply(list1,list2));

        BiFunction<List<Integer>,List<Integer>,List<Integer>> biFunction2= (l1, l2) -> {
            return Stream.of(l1,l2)
                    .flatMap(List::stream)
                    .distinct()
                    .collect(Collectors.toList());
        };

        System.out.println("Lambda approach: "+biFunction2.apply(list1,list2));
        Map<String, Integer> map=new HashMap<>();
        map.put("basant",5000);
        map.put("santosh",3000);
        map.put("mantosh",8000);

        BiFunction<String,Integer,Integer> increaseSalaryBiFunction=new BiFunction<String, Integer, Integer>() {
            @Override
            public Integer apply(String key, Integer value) {
                return value+500;
            }
        };

        //map.replaceAll(increaseSalaryBiFunction);

        BiFunction<String,Integer,Integer> increaseSalaryBiFunction2=(key, value) -> value+500;

        map.replaceAll((key, value) -> value+500);

        System.out.println(map);
    }

}
