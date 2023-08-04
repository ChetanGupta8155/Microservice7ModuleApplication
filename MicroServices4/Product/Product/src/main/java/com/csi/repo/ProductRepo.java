package com.csi.repo;

import com.csi.model.Product;
import io.swagger.models.auth.In;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
