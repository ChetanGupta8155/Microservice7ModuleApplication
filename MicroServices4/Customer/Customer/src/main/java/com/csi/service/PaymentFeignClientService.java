package com.csi.service;

import com.csi.vo.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Payment",url = "http://localhost:9194")
public interface PaymentFeignClientService {
    @GetMapping("/payments/{paymentId}")
    public Payment getDataByPaymentId(@PathVariable int paymentId);
}
