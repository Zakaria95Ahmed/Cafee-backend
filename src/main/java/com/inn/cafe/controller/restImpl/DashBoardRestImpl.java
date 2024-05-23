package com.inn.cafe.controller.restImpl;

import com.inn.cafe.Services.service.DashBoardService;
import com.inn.cafe.controller.rest.DashBoardRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DashBoardRestImpl implements DashBoardRest {
    @Autowired
    DashBoardService dashBoardService;

    @Override
    public ResponseEntity<Map<String, Object>> getCount() {
        return dashBoardService.getCount();
    }
}
