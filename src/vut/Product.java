package vut;
public class Product {
    private Long id;
    private User seller;
    private String name;
    private String description;
    private double price;
    private String imagePath;
    private int stock;

    public Product(Long id, User seller, String name, String description, double price) {
        this.id = id;
        this.seller = seller;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = 0;
    }

    public Long getId() { return id; }
    public User getSeller() { return seller; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public double getPrice() { return price; }
    public String getImagePath() { return imagePath; }
    public void setImagePath(String imagePath) { this.imagePath = imagePath; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
}
