package Library;

public class Book
{
    private String title;
    private String author;
    private int pages;
    private boolean availability;

    public Book(String title, String author, int pages, boolean availability)
    {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.availability = availability;
    }
    public Book(String title, String author, int pages)
    {
        this(title ,author ,pages ,true);
    }

    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean getAvailable() {
        return availability;
    }

    public void setAvailable(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Title=\"" + title + '\"' +
                "| Author='" + author + '\'' +
                "| Pages=" + pages +
                "| Availability=" + availability +
                '}';
    }
}
