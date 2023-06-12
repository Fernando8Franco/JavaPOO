package javapoo01;

import java.util.Scanner;

public class BookService {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Book make_book() {
        String isbn, title, autor;
        int pages;
        Book book = new Book();

        System.out.println("Ingrese el ISBN del libro: ");
        isbn = sc.next();

        System.out.println("Ingrese el título del libro: ");
        title = sc.next();

        System.out.println("Ingrese el autor del libro: ");
        autor = sc.next();

        System.out.println("Ingrese las páginas del libro: ");
        pages = sc.nextInt();

        return book = new Book(isbn, title, autor, pages);
    }

    public void show_book(Book book) {
        /*System.out.println("ISBN: " + book.getIsbn());
        System.out.println("Título: " + book.getIsbn());
        System.out.println("Autor: " + book.getIsbn());
        System.out.println("Páginas: " + book.getIsbn());*/
        System.out.println(book.toString());
    }

}
