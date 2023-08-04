package com.csi.controller;

import com.csi.model.Shipment;
import com.csi.service.ShipmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/shipments")
public class ShipmentController {
    @Autowired
    ShipmentServiceImpl shipmentServiceImpl;

    @PostMapping("/")
    public ResponseEntity<Shipment>saveData(@RequestBody Shipment shipment){
        return ResponseEntity.ok(shipmentServiceImpl.saveData(shipment));
    }

    @GetMapping("/{shippingId}")
    public ResponseEntity<Optional<Shipment>> getDataById(@PathVariable int shippingId){
        return ResponseEntity.ok(shipmentServiceImpl.getDataById(shippingId));
    }
}
