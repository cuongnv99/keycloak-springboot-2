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
@RequestMapping("/erp/danhmuc")
public class DanhMucController {
    @GetMapping(value = "/chinhanh")
    public ResponseEntity<String> getAnonymous() {
        return ResponseEntity.ok("danh mục chi nhánh");
    }

    @GetMapping(value = "/ketoan")
    public ResponseEntity<String> getUser(@RequestHeader String Authorization) {
        return ResponseEntity.ok("danh mục kế toán");
    }

    @GetMapping(value = "/crm")
    public ResponseEntity<String> getAdmin(@RequestHeader String Authorization) {
        return ResponseEntity.ok("danh mục crm");
    }

    @GetMapping(value = "/nhansu")
    public ResponseEntity<String> getAllUser(@RequestHeader String Authorization) {
        return ResponseEntity.ok("danh mục nhân sự");
    }

}
