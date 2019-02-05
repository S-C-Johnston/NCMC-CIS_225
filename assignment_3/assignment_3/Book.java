import java.util.Date;
import java.util.Calendar;//https://stackoverflow.com/a/5165471

/**
 * Meant to represent a Book, in the literary sense. Supports one author,
 * an ISBN, a Title, a Date (of publication), and a number of pages.
 * Fewer than 10 pages is not allowed on this object.
 *
 * @author (Stewart Johnston)
 * @version (2019-02-04.01)
 */
public class Book
{
    private Author author;
    private String isbn; /*
     * Interesting case. Don't want to attempt to save a few bytes with
     * excessive cleverness, here, I just want to store the isbn. The
     * easiest way, at this time, is to just use a string, without
     * getting bogged in details of the exact formatting of an isbn,
     * which I imagine is outside the scope of the purpose of this
     * assignment.
     */
    private Date publication_date;
    private String title;
    private int num_pages;

    /**
     * Constructor for objects of class Book
     */
    public Book()
    {
    }

    /**
     * Set the author's first and last name
     *
     * @param   String  Author's first name
     * @param   String  Author's last name
     * @return  String  The concatenated first and last name
     */
    public void set_author(String name_first, String name_last)
    {
        author.set_name_first(name_first);
        author.set_name_last(name_last);
        return;
    }

}
