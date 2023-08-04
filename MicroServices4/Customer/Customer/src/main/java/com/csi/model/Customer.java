package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    private int custId;

    private String custName;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date custDOB;

    private long custContactNumber;

    private int productId;

    private int userId;

    private int shippingId;

    private int paymentId;

    private int orderId;

    private int cartId;



}
