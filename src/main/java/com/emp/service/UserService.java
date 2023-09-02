package com.emp.service;

import com.emp.req.UserReq;
import com.emp.res.R;

/**
 * @Author Yxh
 * @Date 2023/9/1 18:30
 * @Version 1.0
 */

public interface UserService {
    R userLogin(UserReq userReq);
}
