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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Object.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override;
    public int hashCode() {
        return Object.hash(title, author , publishingYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ". author=" + author +
                ". publishingYear=" + publishingYear +
                '}';
    }
}
