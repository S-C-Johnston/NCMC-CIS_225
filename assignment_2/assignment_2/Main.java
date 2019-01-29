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

    /**
     * main method
     */
    public static void main(String[] args)
    {
        Desk prime_desk = new Desk();
        prompt("Welcome to Hammer Carpentry desk invoicer.\n");
        Integer orderID = prompt_4_int("Please enter an order number: ");
        prompt(orderID.toString());

        STDIN.close();
        return;
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
