package javapoo01;

import java.util.Scanner;

public class BookService {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Book make_book() {

        System.out.println("Ingrese el ISBN del libro: ");
        String isbn = sc.next();

        System.out.println("Ingrese el título del libro: ");
        String title = sc.next();

        System.out.println("Ingrese el autor del libro: ");
        String autor = sc.next();

        System.out.println("Ingrese las páginas del libro: ");
        int pages = sc.nextInt();

        return new Book(isbn, title, autor, pages);
    }

    public void show_book(Book book) {
        System.out.println(book.toString());
    }

}
