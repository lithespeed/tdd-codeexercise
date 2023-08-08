package main.com.discount;

import java.util.List;

public class DiscountService {
    private ProductRepository productRepository;

    public DiscountService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public double applyDiscountForCategory(String category) {
        List<Product> products = productRepository.getProductsByCategory(category);
        double totalDiscount = products.stream().mapToDouble(Product::getDiscount).sum();
        return totalDiscount;
    }
}
