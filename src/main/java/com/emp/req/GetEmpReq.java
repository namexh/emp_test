package com.emp.req;

import lombok.Data;

/**
 * @Author Yxh
 * @Date 2023/9/1 17:28
 * @Version 1.0
 */
@Data
public class GetEmpReq {
    private int page;
    private int limit;
}
