package javapoo01;

public class Book {
    private String isbn;
    private String title;
    private String autor;
    private int pages;

    public Book() {
    }

    public Book(String isbn, String title, String autor, int pages) {
        this.isbn = isbn;
        this.title = title;
        this.autor = autor;
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAutor() {
        return autor;
    }

    public int getPages() {
        return pages;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn + "\n" +
                "Título: " + title + "\n" +
                "Autor: " + autor + "\n" +
                "Páginas: " + pages ;
    }
}
