package com.inn.cafe.controller.rest;


import com.inn.cafe.Model.wrapper.UserWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/user")
public interface UserRest {

    @PostMapping(path = "/signup")
    public ResponseEntity<String> signUp(@RequestBody(required = true) Map<String, String> requestMap);

    @PostMapping(path = "/login")
    public ResponseEntity<String> login(@RequestBody(required = true) Map<String, String> requestMap);

    @GetMapping(path = "/get")
    public ResponseEntity<List<UserWrapper>> getAllUsers();

    @PostMapping(path = "/update")
    public ResponseEntity<String> update(@RequestBody(required = true) Map<String, String> requestMap);

    @GetMapping(path = "/checkToken")
    public ResponseEntity<String> checkToken();

    @PostMapping(path = "/changePassword")
    public ResponseEntity<String> changePassword(@RequestBody(required = true) Map<String, String> requestMap);

    @PostMapping(path = "/forgotPassword")
    public ResponseEntity<String> forgotPassword(@RequestBody(required = true) Map<String, String> requestMap);


}
