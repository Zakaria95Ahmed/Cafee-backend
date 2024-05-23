package com.inn.cafe.Model.Pojo;


import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

@NamedQuery(name = "Product.getAllProducts",
        query = " select new com.inn.cafe.Model.wrapper.ProductWrapper(p.id, p.name, p.description, p.price,p.category.id,p.category.name, p.status)" +
                " from Product p")

@NamedQuery(name = "Product.updateProductStatus",
        query = " update Product  p set p.status=:status where p.id=:id")

@NamedQuery(name = "Product.getProductByCategory",
        query = "select new com.inn.cafe.Model.wrapper.ProductWrapper(p.id, p.name)" +
                " from Product p where p.category.id=:id and p.status='true'")
@NamedQuery(name = "Product.getProductById",
        query = "select new com.inn.cafe.Model.wrapper.ProductWrapper(p.id, p.name,p.description, p.price)" +
                " from Product p where p.id=:id")

@Data
@Entity
@Table(name = "_products")
@DynamicInsert
@DynamicUpdate
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Integer price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_fk", nullable = false)
    private Category category;

    @Column(name = "status")
    private String status;


}
