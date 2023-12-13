package Book;

public class Book implements Comparable<Book>{
    private final int id;
    private String title, author, genre;
    private int ISBN, publicationYear, quantity;
    private double price;

    public Book(int id, String title, String author, String genre, int publicationYear, double price, int quantity){
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publicationYear = publicationYear;
        this.price = price;
        this.quantity =quantity;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Book(id: %d, name: %s, author: %s, genre: %s, publicYear: %d, price: %.2f, quantity: %d)\n",id,title,author,genre,publicationYear,price,quantity);
    }
    @Override
    public int compareTo(Book o) {
        return (int) (this.price - o.getPrice());
    }
}

