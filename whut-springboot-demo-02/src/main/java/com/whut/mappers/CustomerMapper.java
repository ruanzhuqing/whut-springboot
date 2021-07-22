package com.whut.mappers;

import com.whut.entities.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * TODO:客户mapper层，用于对数据库进行增删改查操作
 *
 * @auther Administrator
 * @createdate 2021/7/22
 */

public interface CustomerMapper {
    /**
     * 列出customer表中所有数据
     * @return
     */
    List<Customer> listCustomer();
}
