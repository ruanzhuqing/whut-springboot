package com.whut.service.impl;

import com.whut.entities.Customer;
import com.whut.mappers.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.whut.service.CustomerService;

import java.util.List;

/**
 * TODO:客户业务逻辑的实现类
 *
 * @auther Administrator
 * @createdate 2021/7/22
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;
    /**
     * 列出customer表中所有数据
     *
     * @return
     */
    @Override
    public List<Customer> listCustomer() {
        return customerMapper.listCustomer();
    }
}
