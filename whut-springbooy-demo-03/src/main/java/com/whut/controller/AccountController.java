package com.whut.controller;

import com.whut.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;


/**
 * TODO:用户登录控制器
 *
 * @auther Administrator
 * @createdate 2021/7/22
 */
@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String userName, String userPwd, Model model, HttpSession session){
        boolean result = accountService.login(userName, userPwd);
        if(result){
            session.setAttribute("currentUser",userName);
            return "waterMainMenu";
        }else {
            model.addAttribute("loginFail","用户名或密码错误");
            return "index";
        }
    }
}
