package shop.basket;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class BasketRep {
    private final Map<Integer, Product> productMap;

    public BasketRep() {
        productMap = new HashMap<>();

        productMap.put(1, new Product("картошка", 1));
        productMap.put(2, new Product("молоко", 2));
        productMap.put(3, new Product("творог", 3));
        productMap.put(4, new Product("хлеб", 4));
        productMap.put(5, new Product("яйца", 5));
        productMap.put(6, new Product("сыр", 6));
    }

    public Map<Integer, Product> getProductMap() {
        return productMap;
    }
}
