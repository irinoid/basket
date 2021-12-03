package shop.basket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/order")
@RestController
public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public List<Product> addProduct(@RequestParam int productId) {
        return basketService.addProduct(productId);
    }

    @GetMapping("/get")
    public List<Product> getBasket() {
        return  basketService.printBasket();
    }

}
