package com.csi.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shipment {

    private int shippingId;

    private String shippingAddress;

    private String shippingCode;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date shippingDOB;

}

