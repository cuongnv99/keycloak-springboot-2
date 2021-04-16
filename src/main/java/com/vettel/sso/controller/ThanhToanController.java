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
@RequestMapping("/erp/thanhtoan")
public class ThanhToanController {
    @GetMapping(value = "/dientu")
    public ResponseEntity<String> getAnonymous() {
        return ResponseEntity.ok("thanh toán điện tử ");
    }

    @GetMapping(value = "/tay")
    public ResponseEntity<String> getUser(@RequestHeader String Authorization) {
        return ResponseEntity.ok("thanh toán tay");
    }

}
