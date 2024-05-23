package com.inn.cafe.controller.rest;

import com.inn.cafe.Model.Pojo.Product;
import com.inn.cafe.Model.wrapper.ProductWrapper;
import com.inn.cafe.Model.wrapper.UserWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/product")
public interface ProductRest {

    @PostMapping(path = "/add")
    public ResponseEntity<String> addNewProduct(@RequestBody(required = true) Map<String, String> requestMap);

    @GetMapping(path = "/get")
    public ResponseEntity<List<ProductWrapper>> getAllProducts();

    @PostMapping(path = "/update")
    public ResponseEntity<String> updateProduct(@RequestBody(required = true) Map<String, String> requestMap);

    @PostMapping(path = "/delete/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable(required = true) Integer id);

    @PostMapping(path = "/updateStatus")
    public ResponseEntity<String> updateStatus(@RequestBody(required = true) Map<String, String> requestMap);

    @GetMapping(path = "/getByCategory/{id}")
    public ResponseEntity<List<ProductWrapper>> getByCategory(@PathVariable(required = true) Integer id);

    @GetMapping(path = "/getById/{id}")
    public ResponseEntity<ProductWrapper> getProductById(@PathVariable(required = true) Integer id);

}
