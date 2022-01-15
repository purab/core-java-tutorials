package functional.example;

import java.util.function.Supplier;

public class SupplierDemo implements Supplier {
    @Override
    public Object get() {
        return "hi hello";
    }

    public static void main(String[] args){
        Supplier<String> supplier= new SupplierDemo();
        System.out.println(supplier.get());
    }
}
