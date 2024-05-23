package com.inn.cafe.Model.wrapper;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ProductWrapper {
    Integer id;
    String name;
    String description;
    Integer price;
    Integer categoryId;
    String categoryName;
    String status;

    public ProductWrapper() {
    }

    public ProductWrapper(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public ProductWrapper(Integer id, String name, String description, Integer price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public ProductWrapper(Integer id, String name, String description, Integer price, Integer categoryId, String categoryName, String status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.status = status;
    }
}
