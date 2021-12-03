package shop.basket;

import java.util.List;

public interface BasketService {
    List<Product> addProduct(int productId);
    List<Product> printBasket();
}
