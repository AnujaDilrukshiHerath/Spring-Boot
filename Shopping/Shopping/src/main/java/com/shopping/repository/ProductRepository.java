
package com.shopping.repository;


import com.shopping.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);

    List<Product> findAll();

    Product save(Product product);

    List<Product> saveAll(List<Product> products);

    Optional<Object> findById(int id);

    void deleteById(int id);
}


