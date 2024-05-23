package com.inn.cafe.Services.serviceImpl;

import com.inn.cafe.Jwt.JwtFilter;
import com.inn.cafe.Services.service.DashBoardService;
import com.inn.cafe.dao.BillDao;
import com.inn.cafe.dao.CategoryDao;
import com.inn.cafe.dao.ProductDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class DashBoardServiceImpl implements DashBoardService {


    @Autowired
    private ProductDao productDao;
    @Autowired
    private CategoryDao categoryDao;
    @Autowired
    private BillDao billDao;
    @Autowired
    JwtFilter jwtFilter;


    @Override
    public ResponseEntity<Map<String, Object>> getCount() {
        Map<String, Object> map = new HashMap<>();
        map.put("category", categoryDao.count());
        map.put("product", productDao.count());
        map.put("bill", billDao.count());
        return new ResponseEntity<>(map, HttpStatus.OK);

    }
}
