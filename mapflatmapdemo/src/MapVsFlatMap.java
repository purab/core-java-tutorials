import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<Customer> customers = EkartDatabase.getAll();
        //list of customers convert list of strings - data tranformation
        List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        System.out.println(emails);
    }
}
