package stream.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("maruti");
        list.add("banti");
        list.add("santa");
        list.add("manta");
        list.add("lucy");

        for(String s: list) {
           // System.out.println(s);
        }

        list.stream().filter(x-> x.startsWith("m")).forEach(x-> System.out.println(x));

        //list.stream().forEach(x-> System.out.println(x));

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        //map.forEach((key, value) -> System.out.println(key+ ":"+value));
       // map.entrySet().stream().forEach(obj-> System.out.println(obj));
    }
}
