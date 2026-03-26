import java.util.*;

class Book {
    String title, author, isbn;

    Book(String t, String a, String i) {
        title = t; author = a; isbn = i;
    }
}

class Library {
    ArrayList<Book> list = new ArrayList<>();

    void add(Book b) { list.add(b); }

    void display() {
        for (Book b : list)
            System.out.println(b.title + " " + b.author);
    }

    public static void main(String[] args) {
        Library l = new Library();
        l.add(new Book("Java","James","101"));
        l.add(new Book("Python","Guido","102"));
        l.display();
    }
}