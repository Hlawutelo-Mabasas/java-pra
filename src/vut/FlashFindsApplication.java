package vut;
public class FlashFindsApplication {
    public static void main(String[] args) {
        System.out.println("Flash Finds backend started (simulated).");

        // Simulate API controllers
        UserController userController = new UserController();
        ProductController productController = new ProductController();

        // Example usage
        User seller = userController.register("John Seller", "john@example.com", "1234", Role.SELLER);
        userController.verifySeller(seller, "123456789", "id.pdf");

        Product product = productController.addProduct(seller, "Laptop", "Gaming Laptop", 1200.0);

        System.out.println("All Products:");
        for(Product p : productController.getAllProducts()) {
            System.out.println(p.getName() + " - " + p.getPrice());
        }
    }
}
