package vut;
import java.util.ArrayList;
import java.util.List;

public class ProductController {
    private List<Product> products = new ArrayList<>();
    private long productIdCounter = 1;

    public Product addProduct(User seller, String name, String description, double price) {
        if (seller.getRole() != Role.SELLER || !seller.isVerified()) {
            System.out.println("Cannot add product. Seller not verified.");
            return null;
        }
        Product product = new Product(productIdCounter++, seller, name, description, price);
        products.add(product);
        System.out.println("Product added: " + name);
        return product;
    }

    public List<Product> getAllProducts() {
        return products;
    }
}
