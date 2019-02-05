/**
 * Write a description of class main here.
 *
 * @author (Stewart Johnston)
 * @version (2019-01-28.01)
 */
import java.util.Scanner;
public class Main
{
    private static Scanner STDIN = new Scanner(System.in);
    private static Desk prime_desk = new Desk();
    /**
     * main method
     */
    public static void main(String[] args)
    {

        prompt("Welcome to Hammer Carpentry desk invoicer.\n");
        Integer order_ID = prompt_4_int("Please enter an order number: ");
        prompt("Order ID: " + order_ID.toString());
        STDIN.nextLine();
        prompt_length();

        STDIN.close();
        return;
    }

    /**
     * Prompts the user for the length of the desk
     */
    private static int prompt_length()
    {

        final String LENGTH_MESSAGE = "Please enter the length of the desk in inches: ";
        final String BAD_LENGTH = "Length must be greater than 0 inches.";

        boolean result = prime_desk.set_length(prompt_4_int(LENGTH_MESSAGE));
        while (!result)
        {
            prompt(BAD_LENGTH);
            result = prime_desk.set_length(prompt_4_int(LENGTH_MESSAGE));
        }

        int results = 0;
        return results;
    }

    /**
     * Method to wrangle integer input
     *
     * @param   String  prompt message {@link prompt()}
     * @return  Validated integer input
     */
    private static int prompt_4_int(String message)
    {
        prompt(message);
        final String COMPLAIN_INT = "Expecting a whole number.\n>";
        while(!STDIN.hasNextInt())
        {
            prompt(COMPLAIN_INT);
            STDIN.nextLine();
        }
        int input = STDIN.nextInt();
        STDIN.nextLine();
        return input;
    }

    /**
     * Shorthand method for readability
     * 
     * @param String message to print
     * @return None
     */
    private static void prompt(String message)
    {
        System.out.print(message);
        return;
    }
}
