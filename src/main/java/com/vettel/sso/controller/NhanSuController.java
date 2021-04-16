package com.vettel.sso.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author cuongnv99
 * @project IntelliJ IDEA
 * @created 05/04/2021 - 8:54 AM
 */
@RestController
@RequestMapping("/erp/nhansu")
public class NhanSuController {
    @GetMapping(value = "/them")
    public ResponseEntity<String> getAnonymous() {
        return ResponseEntity.ok("thêm mới nhân sự");
    }

    @GetMapping(value = "/sua" )
    public ResponseEntity<String> getUser(@RequestHeader String Authorization) {
        return ResponseEntity.ok("sửa nhân sự");
    }

    @GetMapping(value = "/xóa" )
    public ResponseEntity<String> getAdmin(@RequestHeader String Authorization) {
        return ResponseEntity.ok("xóa nhân sự");
    }

    @GetMapping(value = "/timkiem" )
    public ResponseEntity<String> getAllUser(@RequestHeader String Authorization) {
        return ResponseEntity.ok("tìm kiếm nhân sự");
    }

}
