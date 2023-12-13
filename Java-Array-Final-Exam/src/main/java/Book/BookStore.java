package Book;

import java.util.Arrays;

public class BookStore {
    private Book[] books;
    private int currentIndex = 0;

    public BookStore(int capacity){
        if (capacity > 0 && capacity < 10000) this.books = new Book[capacity];
    }
    public int getSize(){
        return books.length;
    }

    public boolean addBook(Book newBook){
        if (newBook == null) return false;
        for (int i = 0 ; i < books.length;i++){
            if (this.books[i] != null && this.books[i].getTitle().equals(newBook.getTitle())) {
                int oldQuantity = this.books[i].getQuantity();
                int newQuantity = newBook.getQuantity();
                this.books[i].setQuantity(oldQuantity + newQuantity);
                return true;
            }
        }
        books[currentIndex++] = newBook;
        return true;
    }


    public Book getByTitle(String title){
        for (int i = 0; i < books.length; i++){
            if (books[i].getTitle().equals(title)){
               return books[i];
            }
        }
        return null;
    }

    public Book[] getByAuthor(String author){
        if (author == null) return null;
        int size = 0;
        int currentIndex = 0;
        Book[] authorList = new Book[100];
        for (int i = 0; i < books.length; i++){
            if (this.books[i] != null && books[i].getAuthor().equals(author)){
                authorList[size] = books[i];
                size++;
            }
        }
        authorList = Arrays.copyOf(authorList, size);
        return authorList;
    };

    public Book[] sortByPrice(double lowest, double highest){
        if (lowest < 0 && highest < 0) return null;
        int size = 0;
        int currentIndex = 0;
        Book[] priceList = new Book[100];
        for (int i = 0; i < books.length; i++){
            if (this.books[i] != null && (this.books[i].getPrice() >= lowest && this.books[i].getPrice() <= highest)){
                priceList[size] = books[i];
                size++;
            }
        }

        priceList = Arrays.copyOf(priceList, size);
        Arrays.sort(priceList);
        return priceList;
    }

    public boolean sellBook(int id, int quantity){
        for (int i = 0; i < books.length; i++){
            if (this.books[i].getId() == id){
                int currentQuantity = this.books[i].getQuantity();
                this.books[i].setQuantity(currentQuantity - quantity);
                return true;
            }
        }
        return false;
    }

    public boolean removeBook(int id){
        for (int i = 0; i < books.length; i++){
            if (books[i].getId() == id){
                int currentIndexIsRemoved = i;
                books[i] = null;
                for (int j = currentIndexIsRemoved; j < books.length - 1;j++){
                    books[j] = books[j+1];
                }
                return true;
            }
        }
        return false;

    }

    @Override
    public String toString() {
        return "BookStore{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
