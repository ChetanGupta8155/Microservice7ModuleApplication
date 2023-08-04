package com.csi.service;

import com.csi.vo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Product" ,url = "http://localhost:9191")
public interface ProductFeignClientService {
    @GetMapping("/products/{productId}")
    public Product getDataByProductId(@PathVariable int productId);
}
