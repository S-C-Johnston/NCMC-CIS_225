/**
 * Controlling class, which is effectively a wrangler for costs and an
 * invoice
 *
 * @author (Stewart Johnston)
 * @version (2019-03-01.01)
 */
import java.util.Arrays;
public class WebOMatic
{
    private Invoice invoice;
    private DesignCosts designCosts;
    private boolean[] featureChoices;
    private String design;

    /**
     * Constructor for objects of class WebOMatic
     */
    public WebOMatic()
    {
    }

    /**
     * WebOMatic constructor which takes a design
     */
    public WebOMatic(String design)
    {
       designCosts = new DesignCosts(design);
       this.design = design;
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
        this.design = design;
        designCosts = new DesignCosts(design);
    }

    /**
     * Take an array of bools and shove those into the featureChoices
     * field, prepending them with a "true". Idea is that each bool in
     * the field corresponds with the index of a feature in the
     * designCosts object, so the first element of the array -- relating
     * to the design type in the designCosts object -- will always be
     * true.
     *
     * @param   boolean[]   featureChoices
     * @return  void
     */
    public void chooseFeatures(boolean[] featureChoices)
    {
        this.featureChoices = new boolean[1
            + (featureChoices.length - 1)];
        this.featureChoices[0] = true;
        System.arraycopy(featureChoices, 0, this.featureChoices, 1,
                featureChoices.length);
    }

    /**
     * Get prices/features and add entries to the invoice. Does this in
     * one shot, not incrementally. The invoice will reference a newly
     * instantiated Invoice.
     *
     * @param   none
     * @return  void
     */
    public void calcInvoice()
    {

        invoice = new Invoice();
        costs = designCosts.costs();
        for(int i = 0; i < costs.length(); i++)
        {
            if (0 == i){
                invoice.line_items.put("Design type: " + design,
                        costs[i]);
                continue;
            }

            if (null != featureChoices[i] && true == featureChoices[i]){
                invoice.line_items.put("Feature: " + i.toString(),
                        costs[i]);
            }
        }
    }

}
