package com.vettel.sso.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cuongnv99
 * @project IntelliJ IDEA
 * @created 05/04/2021 - 8:54 AM
 */
@RestController
@RequestMapping("/erp/hanghoa")
public class QuanLyHangHoaController {
    @GetMapping(value = "/them")
    public ResponseEntity<String> getAnonymous() {
        return ResponseEntity.ok("thêm hàng hóa");
    }

    @GetMapping(value = "/sua")
    public ResponseEntity<String> getUser(@RequestHeader String Authorization) {
        return ResponseEntity.ok("sửa hàng hóa");
    }

    @GetMapping(value = "/xoa")
    public ResponseEntity<String> getAdmin(@RequestHeader String Authorization) {
        return ResponseEntity.ok("xóa hàng hóa");
    }

    @GetMapping(value = "/xuat")
    public ResponseEntity<String> getAllUser(@RequestHeader String Authorization) {
        return ResponseEntity.ok("xuất hàng hóa");
    }

}
