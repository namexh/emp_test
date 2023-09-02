package com.emp.service;

import com.emp.req.AddReq;
import com.emp.req.GetEmpReq;
import com.emp.req.QureyEmpReq;
import com.emp.req.UserReq;
import com.emp.res.R;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author Yxh
 * @Date 2023/9/1 17:32
 * @Version 1.0
 */

public interface EmpService {
    R getEmpList(GetEmpReq getEmpReq);
     R getDeptDegree();
    R qureyEmp(QureyEmpReq qureyEmpReq);
    R addEmp( AddReq addReq);
    R updateEmp( AddReq addReq);
    R deleteEmp(AddReq addReq);
}
