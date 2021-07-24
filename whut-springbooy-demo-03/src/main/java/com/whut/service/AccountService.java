package com.whut.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * TODO:用户登录业务逻辑层
 *
 * @auther Administrator
 * @createdate 2021/7/22
 */

public interface AccountService {
    /**
     * 判断用户登录
     * @param userName
     * @param userPwd
     * @return
     */
    boolean login(@Param("userName") String userName, @Param("userPwd") String userPwd);
}
