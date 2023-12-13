import java.util.Arrays;

public class Product {

    private final int id;
    private int category;
    private String name;
    private int price;
    private int amount;
    private static int currentId = 1;

    public Product(int category, String name, int price, int amount) {
        if(!(category > 0 && (name != null && !name.isBlank()) && price > 0 && amount > 0)) {
            throw new IllegalArgumentException("Invalid Argument");
        }

        this.id = (category * 1000) + currentId++;
        this.category = category;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return String.format("%s, id=%d, category=%d, amount=%d, price=%d", name, id, category, amount, price);
    }
}
