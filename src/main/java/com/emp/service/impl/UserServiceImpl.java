package com.emp.service.impl;

import com.emp.entity.User;
import com.emp.mappers.UserMapper;
import com.emp.req.UserReq;
import com.emp.res.R;
import com.emp.service.UserService;
import com.emp.util.Jwtutils;
import com.emp.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * @Author Yxh
 * @Date 2023/9/1 18:32
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public R userLogin(UserReq userReq) {
        //拿到姓名和密码
        String username= userReq.getUsername();
        String password=userReq.getPassword();
        User user= userMapper.userLogin(username);
        Boolean flag=false;
        //先判断数据库里面是否存在这个用户
        if (user!=null){
            try {
                flag=MD5Util.validpassword(password,user.getPassword());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            //如果用户不为空，拿数据库里面的密码和输入的密码作比较
            if (flag){
                String token= Jwtutils.jwtToken(username);
                return R.success(token);
            }else {
                return R.fail();
            }
        }else {
            return R.fail();
        }

    }
}
