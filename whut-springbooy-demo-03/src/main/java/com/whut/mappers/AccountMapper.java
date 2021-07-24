package com.whut.mappers;

import com.whut.entities.Account;
import org.apache.ibatis.annotations.Param;

/**
 * TODO:用户登录的mapper层
 *
 * @auther Administrator
 * @createdate 2021/7/22
 */
public interface AccountMapper {
    Account login(@Param("userName")String userName);
}
