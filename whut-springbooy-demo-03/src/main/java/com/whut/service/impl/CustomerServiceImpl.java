package com.whut.service.impl;

import com.whut.entities.Customer;
import com.whut.mappers.CustomerMapper;
import com.whut.service.CustomerService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    /**
     * 根据客户名称搜素客户信息
     *
     * @returnr
     */
    @Override
    public List<Customer> seachCustomer(@Param("custName") String custName) {
        return customerMapper.seachCustomer(custName);
    }

    /**
     * 添加一条客户信息到customer表中
     *
     * @param customer
     * @return
     */
    @Override
    public Integer saveCustomer(Customer customer) {
        return customerMapper.saveCustomer(customer);
    }

    /**
     * 根据客户id搜素客户信息
     *
     * @param cid
     * @returnr
     */
    @Override
    public Customer getCustomerById(Integer cid) {
        return customerMapper.getCustomerById(cid);
    }

    /**
     * 根据客户id修改客户信息
     *
     * @param customer
     * @returnr
     */
    @Override
    public Integer updateCustomer(Customer customer) {
        return customerMapper.updateCustomer(customer);
    }

    /**
     * 根据客户id删除客户信息
     *
     * @param cid
     * @returnr
     */
    @Override
    public Integer deleteCustomer(Integer cid) {
        return customerMapper.deleteCustomer(cid);
    }
}
