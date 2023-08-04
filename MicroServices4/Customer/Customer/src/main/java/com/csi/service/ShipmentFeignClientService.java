package com.csi.service;

import com.csi.vo.Shipment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Shipment",url = "http://localhost:9193")
public interface ShipmentFeignClientService {
    @GetMapping("/shipments/{shippingId}")
    public Shipment getDataByShippingId(@PathVariable int shippingId);
}
