package shop.basket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Scope(scopeName = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class BasketServiceImpl implements BasketService {

    private final Map<Integer, Product> productMap;
    private final ArrayList<Product> userProductList;

    public BasketServiceImpl() {

        productMap = new HashMap<>();
        userProductList = new ArrayList<>();
        productMap.put(1, new Product("картошка", 1));
        productMap.put(2, new Product("молоко", 2));
        productMap.put(3, new Product("творог", 3));
        productMap.put(4, new Product("хлеб", 4));
        productMap.put(5, new Product("яйца", 5));
        productMap.put(6, new Product("сыр", 6));
    }

    @Override
    public List<Product> addProduct(int productId) {
        if (productMap.containsKey(productId)) {
            Product newProduct = productMap.get(productId);
            userProductList.add(newProduct);
        }
        return userProductList;
    }

    @Override
    public List<Product> printBasket() {
        return userProductList;
    }
}
