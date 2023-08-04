package com.csi.service;

import com.csi.model.Cart;
import com.csi.repo.CartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartServiceImpl {

    @Autowired
    CartRepo cartRepoImpl;

    public Cart saveData(Cart cart){
        return cartRepoImpl.save(cart);
    }

    public Optional<Cart> getDataById(int cartId){
        return cartRepoImpl.findById(cartId);
    }
}
