package com.csi.repo;

import com.csi.model.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentRepo extends JpaRepository<Shipment,Integer> {
}
