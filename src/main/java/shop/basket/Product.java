package shop.basket;

import java.util.Objects;

public class Product {
    private final String productName;
    private final int productId;

    public Product(String productName, int productId) {
        this.productName = productName;
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductId() {
        return productId;
    }

    @Override
    public String toString() {
        return productId + " " + productName;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Product employee1 = (Product) other;
        return productName.equals(employee1.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName);
    }
}
