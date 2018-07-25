package com.mdh.controller;

import com.mdh.pojo.User;
import com.mdh.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by mdh on 2018/7/11.
 */
@RestController
public class TestDemoController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/hello")
    public String hello(HttpServletRequest request){
        String id = request.getParameter("id");
        User user = userService.findById(Integer.parseInt(id));
        return "hello world";
    }
}
