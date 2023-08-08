package main.com.discount;

public class Product {

    private String productName;
    private String categoryName;
    private double discount;

    public Product(String productName, String categoryName, double discount) {
        this.productName = productName;
        this.categoryName = categoryName;
        this.discount = discount;
    }

    public double getDiscount() {
        return this.discount;
    }
}
