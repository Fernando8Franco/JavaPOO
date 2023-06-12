package javapoo01;

public class exercise1 {
    public static void main(String[] args) {
        BookService bs = new BookService();
        Book book = bs.make_book();

        bs.show_book(book);
    }
}
