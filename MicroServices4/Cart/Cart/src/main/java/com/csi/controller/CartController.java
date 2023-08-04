package com.csi.controller;

import com.csi.model.Cart;
import com.csi.service.CartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/carts")
public class CartController {

    @Autowired
    CartServiceImpl cartServiceImpl;

    @PostMapping("/")
    public ResponseEntity<Cart>saveData(@RequestBody Cart cart){
        return ResponseEntity.ok(cartServiceImpl.saveData(cart));
    }

    @GetMapping("/{cartId}")
    public ResponseEntity<Optional<Cart>> getDataById(@PathVariable int cartId){
        return ResponseEntity.ok(cartServiceImpl.getDataById(cartId));
    }
}
