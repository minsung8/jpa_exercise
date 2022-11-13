package org.de.spring.jpa.ex.repository;

import java.util.List;
import javax.transaction.Transactional;
import org.de.spring.jpa.ex.entity.Product;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Product, Long> {
    List<Product> findTop10ByOrderByPriceDesc();
    List<Product> findByPriceGreaterThanOrderByPriceDesc(int price);
    @Modifying
    @Transactional
    @Query("UPDATE product p SET p.price = p.price + :plus where id = :id")
    int plusPrice(Long id, int plus);
}