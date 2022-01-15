package lamda.example;

interface Calculator{
    //void switchOn();
    //void sum(int input);
    int substract(int i1,int i2);
}

public class CalculatorImpl{
    //()->{body}


    public static void main(String[] args) {
        /*Calculator calculator = () -> System.out.println("switch on");
        calculator.switchOn();*/

        /*Calculator calculator = (input) ->  System.out.println("sum:"+input);
        calculator.sum(222);*/

        Calculator calculator = (i1,i2) -> i2-i1;
        System.out.println(calculator.substract(13,89));


    }


}
