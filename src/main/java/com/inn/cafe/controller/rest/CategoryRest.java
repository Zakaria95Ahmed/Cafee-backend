package com.inn.cafe.controller.rest;

import com.inn.cafe.Model.Pojo.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/category")
public interface CategoryRest {

    @PostMapping(path = "/add")
    public ResponseEntity<String> addNewCategory(@RequestBody(required = true) Map<String, String> requestMap);

    @GetMapping(path = "/get")
    public ResponseEntity<List<Category>> getAllCategory(@RequestParam(required = false) String filterValue);

    @PostMapping(path = "/update")
    public ResponseEntity<String> updateCategory(@RequestBody(required = true) Map<String, String> requestMap);


}