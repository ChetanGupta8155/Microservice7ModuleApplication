package com.csi.service;

import com.csi.vo.Orders;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Orders",url = "http://localhost:9195")
public interface OrdersFeignClientSevice {
    @GetMapping("/orderss/{orderId}")
    public Orders getDataByOrderId(@PathVariable int orderId);
}
