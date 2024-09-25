import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void viewProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public Product findProduct(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    public void updateProduct(String name, int quantity) {
        Product product = findProduct(name);
        if (product != null) {
            product.updateQuantity(quantity);
        }
    }
}
