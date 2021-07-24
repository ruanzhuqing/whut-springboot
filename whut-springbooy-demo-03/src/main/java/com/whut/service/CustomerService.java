package com.whut.service;

import com.whut.entities.Customer;
import org.apache.ibatis.annotations.Param;

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
    /**
     * 根据客户名称搜素客户信息
     * @returnr
     */
    List<Customer> seachCustomer(@Param("custName") String custName);

    /**
     * 添加一条客户信息到customer表中
     * @param customer
     * @return
     */
    Integer saveCustomer(Customer customer);

    /**
     * 根据客户id搜素客户信息
     * @returnr
     */
    Customer getCustomerById(@Param("cid") Integer cid);
    /**
     * 根据客户id修改客户信息
     * @returnr
     */
    Integer updateCustomer(Customer customer);

    /**
     * 根据客户id删除客户信息
     * @returnr
     */
    Integer deleteCustomer(Integer cid);
}
