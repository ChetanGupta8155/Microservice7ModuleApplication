package com.csi.service;

import com.csi.model.Payment;
import com.csi.repo.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PaymentServiceImpl {

    @Autowired
    PaymentRepo paymentRepoImpl;

    public Payment saveData(Payment payment){
        return paymentRepoImpl.save(payment);


    }

    public Optional<Payment> getDataById(int paymentId){

        return paymentRepoImpl.findById(paymentId);
    }
}
