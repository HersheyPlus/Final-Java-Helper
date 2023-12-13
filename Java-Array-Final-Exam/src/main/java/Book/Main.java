package Book;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(222,"The Hell On Way","Mark Utils","Novel",2005,600,18);
        Book book2 = new Book(223,"Bomb001","Boki","Novel",2005,200,5);
        Book book3 = new Book(224,"Bomb002","Boki","Novel",2004,1500,2);
        Book book4 = new Book(225,"Gooes Gag","Xter","adas",2001,800,5);
        BookStore books = new BookStore(5);

        books.addBook(book1);
        books.addBook(book2);
        books.addBook(book3);
        books.addBook(book4);
        System.out.println(Arrays.toString(books.sortByPrice(100,1000)));
    }
}
