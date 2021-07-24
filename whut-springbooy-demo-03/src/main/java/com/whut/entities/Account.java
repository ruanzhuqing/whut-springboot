package com.whut.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO:Account 用户登录实体类
 *
 * @auther Administrator
 * @createdate 2021/7/22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private Integer id;
    private String userName;
    private String userPwd;
}
