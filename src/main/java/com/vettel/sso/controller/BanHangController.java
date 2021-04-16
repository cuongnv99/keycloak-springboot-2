package com.vettel.sso.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cuongnv99
 * @project IntelliJ IDEA
 * @created 05/04/2021 - 8:52 AM
 */
@RestController
@RequestMapping("/erp/banhang")
public class BanHangController {
    @GetMapping(value = "/iphone")
    public ResponseEntity<String> getAnonymous() {
        return ResponseEntity.ok("bán iphone");
    }

    @GetMapping(value = "/samsung")
    public ResponseEntity<String> getUser(@RequestHeader String Authorization) {
        return ResponseEntity.ok("bán hàng sam sung");
    }

    @GetMapping(value = "/phukien")
    public ResponseEntity<String> getAdmin(@RequestHeader String Authorization) {
        return ResponseEntity.ok("bán phụ kiện");
    }

    @GetMapping(value = "/ipad")
    public ResponseEntity<String> getAllUser(@RequestHeader String Authorization) {
        return ResponseEntity.ok("bán i pad");
    }
}
