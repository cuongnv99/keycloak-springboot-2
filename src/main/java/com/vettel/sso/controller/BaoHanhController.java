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
@RequestMapping("/erp/baohanh")
public class BaoHanhController {
    @GetMapping(value = "/them")
    public ResponseEntity<String> getAnonymous() {
        return ResponseEntity.ok("thêm mới bảo hành");
    }

    @GetMapping(value = "/sua")
    public ResponseEntity<String> getUser(@RequestHeader String Authorization) {
        return ResponseEntity.ok("sửa bảo hành của khách");
    }

    @GetMapping(value = "/xoa")
    public ResponseEntity<String> getAdmin(@RequestHeader String Authorization) {
        return ResponseEntity.ok("xóa bảo hành");
    }

    @GetMapping(value = "/tonghop")
    public ResponseEntity<String> getAllUser(@RequestHeader String Authorization) {
        return ResponseEntity.ok("tổng hợp bảo hành");
    }

}
