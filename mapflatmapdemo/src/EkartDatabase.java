import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDatabase {

    public static List<Customer> getAll() {
        return Stream.of(
                new Customer(101, "purab", "purab@purab.com", Arrays.asList("23432","2345")),
                new Customer(102, "purab2", "purab2@purab2.com", Arrays.asList("2223432","2345")),
                new Customer(103, "purab3", "purab3@purab3.com", Arrays.asList("2333432","234335")),
                new Customer(104, "purab4", "purab4@purab4.com", Arrays.asList("2344432","234445"))
        ).collect(Collectors.toList());
    }
}
