package com.emp.controller;

import com.emp.req.UserReq;
import com.emp.res.R;
import com.emp.res.SucessLogin;
import com.emp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @Author Yxh
 * @Date 2023/9/1 12:37
 * @Version 1.0
 */
@RestController
@CrossOrigin
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("login")
    public R userLogin(@RequestBody UserReq userReq) {
        return userService.userLogin(userReq);
    }
    @RequestMapping("/info")
    //这里直接返回写死的值
    public SucessLogin getInfo(){
        List list=new ArrayList<>();
        list.add("admin");
        Map map=new HashMap<>();
        map.put("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        map.put("introduction","I am a super administrator");
        map.put("name","Super Admin");
        map.put("roles",list);
        SucessLogin sucessLogin=new SucessLogin<>();
        sucessLogin.setData(map);
        return sucessLogin;
    }
    @RequestMapping("/logout")
    public R LoginOut(){
        return R.success("success");
    }
}
