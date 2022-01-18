import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExceptionHandingDemo {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("44","373","xyz");
        List<Integer> list2 = Arrays.asList(1,0);

        //list2.forEach(handleExceptionIfAny(s-> System.out.println(Integer.parseInt(s))));

        //list.forEach(ExceptionHandingDemo::printList);
        list.forEach(handleGenricException(s-> System.out.println(Integer.parseInt(s)), NumberFormatException.class));
    }

    //approch 2


    public static void printList(String s) {
        try {
            System.out.println(Integer.parseInt(s));
        } catch (Exception e) {
            System.out.println("Exception: "+e.getMessage());
        }

    }

    static Consumer<String> handleExceptionIfAny(Consumer<String> payload) {
        return obj-> {
            try{
                payload.accept(obj);
            } catch (Exception ex) {
                System.out.println("Exception: "+ex.getMessage());
            }
        };
    }

    static <Target, ExObj extends Exception> Consumer<Target> handleGenricException(
            Consumer<Target> targetConsumer,Class<ExObj> exObjClass) {
        return obj-> {
            try{
                targetConsumer.accept(obj);
            } catch (Exception ex) {
                try {
                    ExObj exObj= exObjClass.cast(ex);
                    System.out.println("Exception: "+exObj.getMessage());
                } catch (ClassCastException ecx) {
                    throw ex;
                }
            }
        };
    }
}
