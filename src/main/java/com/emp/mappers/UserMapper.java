package com.emp.mappers;

import com.emp.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author Yxh
 * @Date 2023/9/1 17:26
 * @Version 1.0
 */
@Mapper
public interface UserMapper {
    User userLogin(@Param("username") String username);
//    String getPwdByname(@Param("username") String username);
}
