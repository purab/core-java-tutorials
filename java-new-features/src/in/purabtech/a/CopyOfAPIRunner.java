package in.purabtech.a;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CopyOfAPIRunner {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("purab");
        names.add("ravi");
        names.add("john");
        names.add("tst");

        //copy of introduced in java 10
        //when you want to create inmuttable list use copy of
        List<String> newNames = List.copyOf(names);

        doNotChange(names);

        System.out.println(names);


    }

    private static void doNotChange(List<String> names) {
        names.add("methodadd");
    }
}
