package com.inn.cafe.dao;

import com.inn.cafe.Model.Pojo.Product;
import com.inn.cafe.Model.wrapper.ProductWrapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ProductDao extends JpaRepository<Product,Integer> {

    List<ProductWrapper> getAllProducts();

    @Modifying
    @Transactional
    Integer updateProductStatus(@Param("status") String status, @Param("id") Integer id);

    List<ProductWrapper> getProductByCategory(@Param("id")Integer id);
    ProductWrapper getProductById(@Param("id")Integer id);
}
