package shop.basket;

import java.util.List;

public interface BasketService {
    List<Product> addProduct(List<Integer> productId);
    List<Product> getBasket();
}
