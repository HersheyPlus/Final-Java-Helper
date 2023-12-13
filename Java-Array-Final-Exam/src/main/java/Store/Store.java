import java.util.Arrays;
import java.util.StringJoiner;

public class Store {

    public static Product[][] stocks = new Product[2][5];
    private static int categoryCounts = 0;

    public static boolean add(Product product) {
        int categoryIndex = -1;

        for(int i = 0; i < stocks.length; i++) {
            for(Product p : stocks[i]) {
                if(p == null) continue;
                if(p.getCategory() != product.getCategory()) {
                    continue;
                }

                categoryIndex = i;
                System.out.println("E" + i);
            }
        }

        //Add new category into array
        if(categoryIndex == -1) {
            stocks = Arrays.copyOf(stocks, stocks.length + 2);

            for(int i = 0; i < stocks.length; i++) {
                if(stocks[i] == null) {
                    stocks[i] = new Product[5];
                }
            }
            
            stocks[categoryCounts][0] = product;
            categoryCounts++;
            return false;
        } else {
            Product[] products = stocks[categoryIndex];
            System.out.println("Current: " + categoryIndex);
            if(products[products.length - 1] != null) {
                stocks[categoryIndex] = Arrays.copyOf(products, products.length + 2);
                stocks[categoryIndex][products.length] = product;
            } else {
                for(int i = 0; i < products.length; i++) {
                    if(products[i] != null) continue;
                    products[i] = product;
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean remove(Product product) {
        for(int i = 0; i < stocks.length; i++) {
            Product[] categories = stocks[i];

            for(int j = 0; j < categories.length; j++) {
                Product item = categories[j];
                if(item != null && item.getId() == product.getId()) {
                    stocks[i][j] = null;
                    return true;
                }
            }
        }

        return false;
    }

    public static Product getByName(String name) {
        for(int i = 0; i < stocks.length; i++) {
            Product[] categories = stocks[i];

            for(int j = 0; j < categories.length; j++) {
                Product item = categories[j];
                if(item != null && item.getName().equalsIgnoreCase(name)) {
                    return item;
                }
            }
        }

        return null;
    }

    public static Product[] getByCategory(int category) {
        boolean found = false;
        for(int i = 0; i < stocks.length; i++) {
            Product[] categories = stocks[i];

            for(int j = 0; j < categories.length; j++) {
                Product item = categories[j];
                if(item != null && item.getCategory() == category) {
                   found = true;
                }
            }
        }

        if(found) {
            return stocks[category];
        }

        return null;
    }

    public static String listAllProduct() {
        StringBuilder toReturn = new StringBuilder();

        for(int category = 0; category < stocks.length; category ++) {
            toReturn.append("Category: " + (category + 1) + "\n");
            for(Product product : stocks[category]) {
                if(product == null) continue;
                toReturn.append("- " + product + "\n");
            }
        }

        return toReturn.toString();
    }


    public static String listByCategory(int category) {
        StringBuilder toReturn = new StringBuilder();

        if(stocks[category - 1] == null) {
            return "Category not found";

        }
        toReturn.append("Category: " + (category) + "\n");
        for(Product product : stocks[category-1]) {
            if(product == null) continue;
            toReturn.append("- " + product + "\n");
        }

        return toReturn.toString();
    }

    public static int findByBinary(Product product) {
        Product[] arr = stocks[0];
        Product[] toFind = new Product[10];
        int c = 0;
        for(Product p : arr) {
            if(p == null) continue;
            toFind[c++] = p;
        }
        return Arrays.binarySearch(toFind, product);
    }
}
