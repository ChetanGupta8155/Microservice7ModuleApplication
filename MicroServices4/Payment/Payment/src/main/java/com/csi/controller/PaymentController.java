package com.csi.controller;

import com.csi.model.Payment;
import com.csi.service.PaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    PaymentServiceImpl paymentServiceImpl;

    @PostMapping("/")
    public ResponseEntity<Payment> saveData(@RequestBody Payment payment){
        return ResponseEntity.ok(paymentServiceImpl.saveData(payment));
    }

    @GetMapping("/{paymentId}")
    public ResponseEntity<Optional<Payment>> getDataById(@PathVariable int paymentId){
        return ResponseEntity.ok(paymentServiceImpl.getDataById(paymentId));
    }
}
