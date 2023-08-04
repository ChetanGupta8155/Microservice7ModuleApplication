package com.csi.vo;

import com.csi.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RestTemplateVO {

    private Product product;

    private Users users;

    private Shipment shipment;

    private Payment payment;

    private Orders orders;

    private Cart cart;

    private Customer customer;
}
