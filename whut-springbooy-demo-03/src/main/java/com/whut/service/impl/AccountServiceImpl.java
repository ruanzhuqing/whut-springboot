package com.whut.service.impl;

import cn.hutool.crypto.digest.DigestUtil;
import com.whut.entities.Account;
import com.whut.mappers.AccountMapper;
import com.whut.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.Objects;

/**
 * TODO:用户登录业务逻辑层实现类
 *
 * @auther Administrator
 * @createdate 2021/7/22
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    /**
     * 判断用户登录
     *
     * @param userName
     * @param userPwd
     * @return
     */
    @Override
    public boolean login(String userName, String userPwd) {
        Account account = accountMapper.login(userName);

        if (null == account){
            return false;
        }
        String password = DigestUtil.md5Hex(userPwd);
        if(Objects.equals(password,account.getUserPwd())){
            return true;
        }
        else {
            return false;
        }
    }
}
