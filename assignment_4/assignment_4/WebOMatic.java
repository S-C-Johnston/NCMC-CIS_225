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
    private boolean[] featureChoices;

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

    /**
     * Take an array of bools and shove those into the featureChoices
     * field. Idea is that each bool in the field corresponds with the
     * index of a feature in the designCosts object, so the first
     * element of the array -- relating to the design type in the
     * designCosts object -- will always be true.
     *
     * @param   boolean[]   featureChoices
     * @return  void
     */
    public void chooseFeatures(boolean[] featureChoices)
    {
        this.featureChoices = new boolean[] {true, featureChoices.clone()};
    }
}
