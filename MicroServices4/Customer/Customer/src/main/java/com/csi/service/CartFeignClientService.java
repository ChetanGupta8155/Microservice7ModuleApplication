package com.csi.service;

import com.csi.vo.Cart;
import com.csi.vo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name ="Cart" ,url = "http://localhost:9196")
public interface CartFeignClientService {

    @GetMapping("/carts/{cartId}")
    public Cart getDataByCartId(@PathVariable int cartId);
}
