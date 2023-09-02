package com.emp.res;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Yxh
 * @Date 2023/9/1 17:15
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class R<T> {
    private int code;
    private String msg;
    private T data;
    public static R success(Object data){
       R r=new R();
       r.setCode(20000);
       r.setMsg("success");
       r.setData(data);
       return r;
    }
    public static R fail(){
        R r=new R();
        r.setCode(401);
        r.setMsg("fail");
        return r;
    }
}
