
/**
 * Simple object, a pair of Strings representing a an Author's First and Last name.
 *
 * @author (Stewart Johnston)
 * @version (2019-02-04.01)
 */
public class Author
{
    private String name_last;
    private String name_first;

    /**
     * Constructor for objects of class Author
     */
    public Author(String name_last, String name_first)
    {
        this.name_last = name_last;
        this.name_first = name_first;
    }

    /**
     * Return the first name of this author
     *
     * @return    String    First name of author
     */
    public String name_first()
    {
        return name_first;
    }

    /**
     * Return the last name of this author
     *
     * @return    String    Last name of author
     */
    public String name_last()
    {
        return name_last;
    }

    /**
     * Set a new first name for an author
     * 
     * @param   String  New first name
     * @return  String the name given
     */
    public String set_name_first(String name_first)
    {
        this.name_first = name_first;
        return name_first;
    }

    /**
     * Set a new last name for an author
     * 
     * @param   String  New first name
     * @return  String the name given
     */
    public String set_name_last(String name_last)
    {
        this.name_last = name_last;
        return name_last;
    }
}
