package com.alami.sharia.application.service.repository;

import com.alami.sharia.application.service.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
    List<Product> findByNameContaining(String name);
    List<Product> findBySellerId(String sellerId);
}
