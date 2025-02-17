package practice_3;

public class Library {
    private String bookTitle;
    protected String author;
    int year;
    public String category;

    Library(String bookTitle, String author, int year, String category) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.year = year;
        this.category = category;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public void setBookTitle(String newBookTitle) {
        this.bookTitle = newBookTitle;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String newCategory) {
        this.category = newCategory;
    }
}
