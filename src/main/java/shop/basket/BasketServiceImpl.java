package shop.basket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService {


    private final List<Product> userProductList;
    private final List<Product> userCurrentProductList;

    public BasketServiceImpl() {
        userProductList = new ArrayList<>();
        userCurrentProductList = new ArrayList<>();
    }

    @Autowired
    private BasketRep basketRep;

    @Override
    public List<Product> addProduct(List<Integer> productId) {
        userCurrentProductList.clear();
        for (int i = 0; i < productId.size(); i++) {
            if (basketRep.getProductMap().containsKey(productId.get(i))) {
                Product newProduct = basketRep.getProductMap().get(productId.get(i));
                userCurrentProductList.add(newProduct);
                userProductList.add(newProduct);
            }
        }
        return userCurrentProductList;
    }

    @Override
    public List<Product> getBasket() {
        return userProductList;
    }
}
