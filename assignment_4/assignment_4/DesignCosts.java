/**
 * Write a description of class designCosts here.
 *
 * @author (Stewart Johnston)
 * @version (2019-02-19.01)
 */
public class DesignCosts
{
    // instance variables - replace the example below with your own
    private int[] costs;

    /**
     * Constructor for objects of class designCosts
     */
    public DesignCosts(String design_type)
    {
        design_type = design_type.toLowerCase();
        switch (design_type) {
            case "nature": costs = new int[] {300, 10, 15, 20, 25, 30};
                           break;
            case "tech": costs = new int[] {350, 20, 30, 40, 50, 60};
                         break;
            case "business": costs = new int[] {375, 30, 40, 50, 60,
                                 70};
                             break;
            case "music": costs = new int[] {400, 85, 95, 110, 130,
                              210};
                          break;
            case "naughty": costs = new int[] {500, 100, 200, 300, 400,
                                500};
                            break;
        }
    }

    public int[] costs()
    {
        return costs;
    }

    /**
     * The value in costs at an index. If the index is out of
     * range, returns a 0. I know that the IndexOutOfBounds exception
     * exists, but this assignment code is not necessarily meant to
     * demonstrate exception handling.
     *
     * @paremeter   int index
     * @return  int cost at index XOR 0 if out of bounds
     */
    public int costAtIndex(int index)
    {
        if (0 <= index && index < costs.length) {
            return costs[index];
        }
        else return 0;
    }

}
