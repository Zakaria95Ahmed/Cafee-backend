package com.inn.cafe.Services.service;

import com.inn.cafe.Model.Pojo.Bill;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface BillService {


     ResponseEntity<String> generateReport(Map<String, Object> requestMap);


    ResponseEntity<List<Bill>> getBills();

    ResponseEntity<byte[]> getPdf(Map<String, Object> requestMap);

    ResponseEntity<String> deleteBill(Integer id);
}
