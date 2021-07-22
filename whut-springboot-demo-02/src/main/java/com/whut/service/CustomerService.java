package com.whut.service;

import com.whut.entities.Customer;

import java.util.List;

/**
 * TODO:客户管理业务逻辑层，调用mapper层
 *
 * @auther Administrator
 * @createdate 2021/7/22
 */

public interface CustomerService {
    /**
     * 列出customer表中所有数据
     * @return
     */
    List<Customer> listCustomer();
}
