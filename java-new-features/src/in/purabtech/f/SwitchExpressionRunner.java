package in.purabtech.f;

public class SwitchExpressionRunner {
    public static String findDayOfWeek(int day) {
        String dayOfWeek = "";
        switch (day) {
            case 0: dayOfWeek ="Sunday"; break;
            case 1: dayOfWeek ="Monday"; break;
            case 2: dayOfWeek ="Thesday"; break;
            case 3: dayOfWeek ="Wednesday"; break;
            case 4: dayOfWeek ="Thursday"; break;
            case 5: dayOfWeek ="Friday"; break;
            case 6: dayOfWeek ="Saturday"; break;
            default: throw new IllegalArgumentException("Invalid Argument!");
        }
        return dayOfWeek;
    }

    //with java 11
    public static String findDayOfWeekWithSwitchExpression(int day) {
        String dayOfWeek = switch (day) {
            case 0 -> "Sunday";
            case 1-> "Monday";
            case 2-> "Thesday";
            case 3-> "Wednesday";
            case 4-> "Thursday";
            case 5-> "Friday";
            case 6-> "Saturday";
            default-> throw new IllegalArgumentException("Invalid Argument!");
        };
        return dayOfWeek;
    }

    public static void main(String[] args) {

    }
}
