import java.io.Console;

public class Intro {
    public static void main(String[] args) {

        Console console = System.console();
        String name = console.readLine("What is your name? ");
        String adjective = console.readLine("Enter an adjective: ");
        String noun = console.readLine("Enter a noun: ");
        String adverb = console.readLine("Enter an adjective: ");
        String verb = console.readLine("Enter a verb ending in -ing: ");
        console.printf("Your story:\n-------------------------\n");
        console.printf("%s is a %s %s\n", name, adjective, noun);
        console.printf("They are always %s %s.", name, adjective);
    }
}