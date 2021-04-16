package com.vettel.sso.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/erp/baocao")
public class BaoCaoController {

    @GetMapping(value = "/taisan")
    public ResponseEntity<String> getAnonymous() {
        return ResponseEntity.ok("báo cáo tài sản");
    }

    @GetMapping(value = "/ton")
    public ResponseEntity<String> getUser(@RequestHeader String Authorization) {
        return ResponseEntity.ok("báo cáo tồn");
    }

    @GetMapping(value = "/nhap")
    public ResponseEntity<String> getAdmin(@RequestHeader String Authorization) {
        return ResponseEntity.ok("báo cáo nhập");
    }

    @GetMapping(value = "/xuat")
    public ResponseEntity<String> getAllUser(@RequestHeader String Authorization) {
        return ResponseEntity.ok("báo cáo xuất");
    }

}