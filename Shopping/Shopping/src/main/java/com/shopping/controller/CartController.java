
package com.shopping.controller;

import com.shopping.entity.Cart;
import com.shopping.entity.Product;
import com.shopping.service.CartService;
import com.shopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/cart")
@RestController

public class CartController {

    @Autowired
    private CartService service;

    @PostMapping("/addCart")
    public Cart addProduct(@RequestBody Cart cart) {
        return service.saveCart(cart);
    }

    @PostMapping("/addCarts")
    public List<Cart> addCarts(@RequestBody List<Cart> carts) {
        return (List<Cart>) service.saveCart((Cart) carts);
    }

    @GetMapping("/carts")
    public List<Cart> findAllCarts() {
        return service.getCarts();
    }

    @GetMapping("/cartById/{id}")
    public Object findProductById(@PathVariable int id) {
        return service.getCartById(id);
    }

    @GetMapping("/cart/{name}")
    public Cart findCartByName(@PathVariable String name) {
        return service.getCartByName(name);
    }

    @PutMapping("/update")
    public Cart updateCart(@RequestBody Cart cart) {
        return service.updateCart(cart);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCart(@PathVariable int id) {
        return service.deleteCart(id);
    }
}

