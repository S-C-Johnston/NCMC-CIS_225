
/**
 * Compute the cost of a custom desk
 *
 * @author (Stewart Johnston)
 * @version (2019-01-27.01)
 */
import java.util.Map;
import java.util.HashMap;
public class Desk
{

    private static final int BASE_PRICE = 200;
    private static final Map<String, Integer> WOODS = new HashMap<String, Integer>();
    private String wood_choice;
    private static final int DRAWER_CHARGE = 30;
    private int drawer_count;
    private Map<String, Integer> line_items;
    private static final int FOOT_INCHES = 12;
    private static final int SURFACE_CHARGE = 50;
    private static final int SURFACE_THRESHOLD = 750;
    private int length, width, surface_area;

    /**
     * Constructor for objects of class Desk
     */
    public Desk()
    {   
        WOODS.put("mahogany", 150);
        WOODS.put("oak", 125);
        WOODS.put("pine", 0);
        line_items = new HashMap<String, Integer>();
        line_items.put("base cost", BASE_PRICE);
        drawer_count = 0;
        surface_area = length = width = 0;

    }

    /**
     * Retrieve the map of woods and values
     * 
     * @param None
     * @return WOODS Map, key and value of String and Integer
     */
    public Map<String, Integer> woods()
    {
        return WOODS;
    }

    /**
     * Print line items and their costs, including a subtotal
     *
     * @param  None
     * @return No return value; prints the contents of line_items
     */
    public void print_line_items()
    {
        int subtotal = 0;
        line_items.forEach((k, v)->System.out.println(k + ":\t$" + v));
        for(Integer value: line_items.values()){
            subtotal += value;
        }
        System.out.println("subtotal:\t$" + subtotal);

        return;
    }

    /**
     * Set length in inches
     * 
     * @param int length of Desk
     * @return True if value is acceptable (> 0), false otherwise
     */
    public boolean set_length(int new_length)
    {
        if (0 >= new_length)
        {
            return false;
        }

        length = new_length;
        this.set_surface_area(length * width);
        return true;
    }

    /**
     * Set width in inches
     * 
     * @param int width of Desk
     * @return True if value is acceptable (> 0), false otherwise
     */
    public boolean set_width(int new_width)
    {
        if (0 >= new_width)
        {
            return false;
        }

        width = new_width;
        this.set_surface_area(length * width);
        return true;
    }

    /**
     * Set the desk's surface area and appropriate charge
     * <p>
     * If the new surface area exceeds the surface area threshold, then
     * the surface area charge is applied in the line items.
     * </p>
     *
     * @param int surface area
     * @return True if surface area is acceptable (> 0), false otherwise
     */
    private boolean set_surface_area(int new_surface_area)
    {
        if (0 >= new_surface_area)
        {
            return false;
        }

        surface_area = new_surface_area;
        String LINE_ITEMS_SURFACE_KEY = "surface charge";

        if (SURFACE_THRESHOLD <= surface_area)
        {
            line_items.put(LINE_ITEMS_SURFACE_KEY, SURFACE_CHARGE);
        }
        else if ((SURFACE_THRESHOLD > surface_area) && (surface_area > 0))
        {
            line_items.remove(LINE_ITEMS_SURFACE_KEY);
        }

        return true;
    }

    /**
     * Set number of drawers for desk
     * 
     * @param int drawer count
     * @return True if acceptable number (>= 0), false otherwise
     */
    public boolean set_drawer_count(int new_drawer_count)
    {
        if (0 > new_drawer_count)
        {
            return false;
        }
        String LINE_ITEMS_DRAWER_KEY = "drawers (" + drawer_count + ")";
        line_items.remove(LINE_ITEMS_DRAWER_KEY);

        drawer_count = new_drawer_count;
        LINE_ITEMS_DRAWER_KEY = "drawers (" + drawer_count + ")";

        if (0 < drawer_count)
        {
            line_items.put(LINE_ITEMS_DRAWER_KEY, (drawer_count * DRAWER_CHARGE));
        }

        return true;
    }

}
