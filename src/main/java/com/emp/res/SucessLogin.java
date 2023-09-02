package com.emp.res;

import lombok.Data;

/**
 * @Author Yxh
 * @Date 2023/9/1 19:16
 * @Version 1.0
 */
@Data
public class SucessLogin<T> {
    private int code=20000;
    private T data;
}
