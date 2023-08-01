public class Main {

    public static void main(String[] args) {
        Author ekkel = new Author("Брюс", "Эккель");
        Author martin = new ("Роберт", "Мартин");

        Book javaPhilosophy = new Book("Философия Java", ekkel, 2017);
        Book cleanCode = new Book("Чистый код", martin, 2021);

        printBook(javaPhilosophy);
        printBook(cleanCode);

        javaPhilosophy.setPublishingYear(2020);

        printBook(javaPhilosophy);
    }

    public static void printBook(Book book) {
        System.out.println(book.getTitle() + " " + book.getPublishingYear()
                + " " + book.getAuthor().getFirstName() + " " + book.getAuthor().getSecondName());
    }
}
