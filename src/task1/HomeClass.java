package task1;

public class HomeClass {

    public static void main(String[] args) {
        printMessage("Hello Method");
        System.out.println(printMessage("Hello updated Method"));
    }

    public static String printMessage (String message) {
        return message;
    }
}