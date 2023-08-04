package com.csi.service;

import com.csi.model.Shipment;
import com.csi.repo.ShipmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class ShipmentServiceImpl {

    @Autowired
    ShipmentRepo shipmentRepoImpl;

    public Shipment saveData(Shipment shipment){
        return shipmentRepoImpl.save(shipment);
    }

    public Optional<Shipment> getDataById(int shippingId){
        return shipmentRepoImpl.findById(shippingId);
    }


}
