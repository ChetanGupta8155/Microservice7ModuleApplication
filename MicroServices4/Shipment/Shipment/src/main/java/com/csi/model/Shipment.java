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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "shipments")
public class Shipment {
    @Id

    private int shippingId;

    private String shippingAddress;

    private String shippingCode;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date shippingDOB;


}
