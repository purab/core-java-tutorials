package in.purabtech.d;

public class StringApiRunner {
    public static void main(String[] args) {
        //isblack introduced in java 11 and other also
        System.out.println(" ".isBlank());

        System.out.println(" LR ".strip());
        System.out.println(" LR ".stripLeading());
        System.out.println(" LR ".stripTrailing());
        "test\ntest\n".lines().forEach(System.out::println);

        System.out.println("tesing %s" .formatted("purab"));

    }
}
