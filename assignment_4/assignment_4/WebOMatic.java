/**
 * Controlling class, which is effectively a wrangler for costs and an
 * invoice
 *
 * @author (Stewart Johnston)
 * @version (2019-03-01.01)
 */
public class WebOMatic
{
    private Invoice invoice;
    private DesignCosts designCosts;

    /**
     * Constructor for objects of class WebOMatic
     */
    public WebOMatic()
    {
    }

    /**
     * Assigns designCosts to new DesignCosts object constructed with
     * the parameter string as input.
     *
     * @param   String  design
     * @return  void
     */
    public void chooseDesign(String design)
    {
        designCosts = new DesignCosts(design);
    }
}
