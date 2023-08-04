package com.csi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

    @GetMapping("/customerfallback")
    public ResponseEntity<String>customerFallBack(){
        return ResponseEntity.ok("customer service is down please wait !!!");
    }


    @GetMapping("/productfallback")
    public ResponseEntity<String>productFalLBack(){
        return ResponseEntity.ok("product service is down please wait");
    }

    @GetMapping("/paymentfallback")
    public ResponseEntity<String>paymentFalLBack(){
        return ResponseEntity.ok("payment service is down please wait");
    }

    @GetMapping("/usersfallback")
    public ResponseEntity<String>usersFalLBack(){
        return ResponseEntity.ok("users service is down please wait");
    }

    @GetMapping("/shipmentfallback")
    public ResponseEntity<String>shipmentFalLBack(){
        return ResponseEntity.ok("shipment service is down please wait");
    }

    @GetMapping("/ordersfallback")
    public ResponseEntity<String>ordersFalLBack(){
        return ResponseEntity.ok("orders service is down please wait");
    }

    @GetMapping("/cartfallback")
    public ResponseEntity<String>cartFalLBack(){
        return ResponseEntity.ok("cart service is down please wait");
    }
}
