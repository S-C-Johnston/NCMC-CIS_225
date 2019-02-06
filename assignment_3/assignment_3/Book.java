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
     * Set the author's last and first name
     *
     * @param   String  Author's last name
     * @param   String  Author's first name
     * @return  String  The concatenated last and first name
     */
    public void set_author(String name_last, String name_first)
    {
        author.set_name_last(name_last);
        author.set_name_first(name_first);
        return;
    }

    /**
     * Get the author's full name
     *
     * @return  String  the author's last and first name, in the format
     * "Last, First", such as "Doe, John". This is more consistent with
     * how books are normally kept in databases, and codes are usually
     * derived from the last, rather than the first name.
     */
    public String author_full()
    {
        return (author.name_last() + ", " + author.name_first())
    }

    /**
     * Set a new isbn for this book object
     *
     * @param   String  new isbn
     * @return  void
     */
    public void set_isbn(String new_isbn)
    {
        isbn = new_isbn;
        return;
    }

    /**
     * Returns the isbn of this book
     *
     * @return  String  isbn
     */
    public String isbn()
    {
        return isbn;
    }

}
