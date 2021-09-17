package com.shopping.service;

import com.shopping.entity.Cart;
import com.shopping.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class CartService {

    @Autowired
    private CartRepository repository;

    public Cart saveCart(Cart cart) {
        return repository.save(cart);
    }

    public List<Cart> saveProducts(List<Cart> carts) {
        return repository.saveAll(carts);
    }

    public List<Cart> getCarts() {
        return repository.findAll();
    }

    public Object getCartById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Cart getCartByName(String name) {
        return repository.findByName(name);
    }

    public String deleteCart(int id) {
        repository.deleteById(id);
        return "cart removed !! " + id;
    }

    public Cart updateCart(Cart cart) {
        Cart existingCart = (Cart) repository.findById(cart.getID()).orElse(null);
        existingCart.setID(cart.getID());
        existingCart.setUser(cart.getUser());
        existingCart.setTotal(cart.getTotal());
       // existingCart.setProductList(cart.getProductList());

        return repository.save(existingCart);
    }


}