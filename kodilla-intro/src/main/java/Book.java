public class Book {

    private static String author;
    private static String title;


    public Book (String author, String title) {

        this.title = title;
        this.author = author;
    }

    public static Book of(String author, String title) {
        Book book = Book.of(author,title);

        return Book.of(author,title);
    }

    public static void main(String[] args) {
        Book book = new Book("Isaac Asimov","The Galaxy");
        System.out.println("Book of" + " " + author + " - " + title);
    }

}



