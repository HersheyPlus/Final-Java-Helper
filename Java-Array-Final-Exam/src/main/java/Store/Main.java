

public class Main {

    public static void main(String[] args) {
        Product apple = new Product(1, "Apple", 150, 5);
        Product orange = new Product(1, "Orange", 150, 5);

        Product shirt = new Product(2, "Shirt", 300, 7);
        Product plant = new Product(2, "Plant", 150, 2);


        Store.add(apple);
        Store.add(orange);

        Store.add(shirt);
        Store.add(plant);

        System.out.println(Store.listAllProduct());
        System.out.println(Store.listByCategory(1));

        Store.findByBinary(apple);
    }


}
