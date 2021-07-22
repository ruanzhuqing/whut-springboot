package com.whut.controller;

import com.whut.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO:客户管理控制器
 *
 * @auther Administrator
 * @createdate 2021/7/22
 */
@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/custList")
    public String listCustomer(){
        return customerService.listCustomer().toString();
    }

}
