public class Book {
    private String title;
    private Author author;
    private int publishingYear = publishingYear;

    public Book(String title, Author author, int publishingYear) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingYear() {
        return publishingYear;
    }

    public String setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
