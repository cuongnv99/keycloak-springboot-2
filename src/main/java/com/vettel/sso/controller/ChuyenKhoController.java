package com.vettel.sso.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cuongnv99
 * @project IntelliJ IDEA
 * @created 05/04/2021 - 8:54 AM
 */
@RestController
@RequestMapping("/erp/chuyenkho")
public class ChuyenKhoController {
    @RequestMapping(value = "/them", method = RequestMethod.GET)
    public ResponseEntity<String> getAnonymous() {
        return ResponseEntity.ok("thêm loại chuyển kho");
    }

    @RequestMapping(value = "/sua", method = RequestMethod.GET)
    public ResponseEntity<String> getUser(@RequestHeader String Authorization) {
        return ResponseEntity.ok("sửa loại chuyển kho");
    }

    @RequestMapping(value = "/xem", method = RequestMethod.GET)
    public ResponseEntity<String> getAdmin(@RequestHeader String Authorization) {
        return ResponseEntity.ok("xem loại chuyển kho");
    }

    @RequestMapping(value = "/xuat", method = RequestMethod.GET)
    public ResponseEntity<String> getAllUser(@RequestHeader String Authorization) {
        return ResponseEntity.ok("xuất loại chuyển kho");
    }

}
