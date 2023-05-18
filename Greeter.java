import java.io.Console;

public class Greeter {
    public static void main(String[] args) {

        Console console = System.console();

        int age = 12;
        if (age < 13) {
            console.printf("Sorry, you must be at least 13 to use this program.\n");
            System.exit(0);
        }

        String name = console.readLine("What is your name? ");
        String place = "my crib";
        console.printf("Hello %s! Welcome to %s", name, place);
    }
}