import java.io.Console;

public class Greeter {
    public static void main(String[] args) {

        Console console = System.console();

        String name = console.readLine("What's your name?: ");
        String place = console.readLine("Where are you from?: ");
        console.printf("Hello %s! Welcome to %s", name, place);
    }
}