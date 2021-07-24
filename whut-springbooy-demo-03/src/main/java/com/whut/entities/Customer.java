package com.whut.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO:Customer客户实体类
 *
 * @auther Administrator
 * @createdate 2021/7/22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private Integer cid;
    private String custName;
    private String custMobile;
    private String custAddress;
    private Integer custTicket;
}
