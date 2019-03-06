/**
 * A class composed of a Map (line_items) of entries and prices for line
 * items in an invoice. The main purpose of this class is to provide
 * utility around the line_items Map, and there aren't any special rules
 * for it besides generic types. As such, I see no reason not to expose
 * line_items directly, rather than writing delegator methods for the
 * entirety of the Map interface.
 *
 * @author (Stewart Johnston)
 * @version (2019-03-03.01)
 */
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap; //Because the order of entry is more
//important than time to access any particular value by its key. Also,
//it prevents my having to rewrite the wheel or perform alorithmic
//wizardry.

public class Invoice
{
    /**
     * Print line items and their costs, including a subtotal
     *
     * @param  None
     * @return No return value; prints the contents of line_items
     */
    public static void print_line_items(Map<String, Integer> line_items)
    {
        int subtotal = 0;
        line_items.forEach((k, v)->System.out.println(k + ":\t$" + v));
        for(Integer value: line_items.values()){
            subtotal += value;
        }
        System.out.println("subtotal:\t$" + subtotal);

        return;
    }

}
