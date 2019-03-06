/**
 * Controlling class, which is effectively a wrangler for costs and an
 * invoice
 *
 * @author (Stewart Johnston)
 * @version (2019-03-01.01)
 */

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class WebOMatic
{
    public Map<String, Integer> line_items; //invoice
    private boolean isInvoiceCalculated = false;
    private DesignCosts designCosts;
    private boolean[] featureChoices;
    private String design;

    /**
     * Constructor for objects of class WebOMatic
     */
    public WebOMatic()
    {
        line_items = new LinkedHashMap<String, Integer>();
        design = "nature";
        designCosts = new DesignCosts(design);
        featureChoices = new boolean[] {true};
    }

    /**
     * WebOMatic constructor which takes a design
     */
    public WebOMatic(String design)
    {
        this.design = design;
        designCosts = new DesignCosts(design);
        line_items = new LinkedHashMap<String, Integer>();
        featureChoices = new boolean[] {true};
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
        this.featureChoices = new boolean[1 + featureChoices.length];
        this.featureChoices[0] = true;
        System.arraycopy(featureChoices, 0, this.featureChoices, 1,
                featureChoices.length);
        isInvoiceCalculated = false;
    }

    /**
     * Get prices/features and add entries to the line_items. Does this
     * in one shot, not incrementally. The line_items will reference a
     * newly instantiated Map.
     *
     * @param   none
     * @return  void
     */
    public void calcInvoice()
    {

        line_items = new LinkedHashMap<String, Integer>();
        int[] costs = designCosts.costs();
        for(int i = 0; i < costs.length; i++)
        {
            if (0 == i)
            {
                line_items.put("Design type: " + design,
                        costs[i]);
                continue;
            }

            if ((featureChoices.length > i) && true ==
                    featureChoices[i])
            {
                line_items.put("Feature: " + i, costs[i]);
            }
        }

        isInvoiceCalculated = true;
    }

    /**
     * Invoke Invoice.print_line_items() on line_items object. If the
     * invoice is not calculated, call a method to do so.
     */
    public void printInvoice()
    {
        if (! isInvoiceCalculated) {
            calcInvoice();
        }

        Invoice.print_line_items(line_items);
    }

}
