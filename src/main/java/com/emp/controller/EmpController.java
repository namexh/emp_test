package com.emp.controller;

import com.emp.req.AddReq;
import com.emp.req.GetEmpReq;
import com.emp.req.QureyEmpReq;
import com.emp.req.UserReq;
import com.emp.res.R;
import com.emp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author Yxh
 * @Date 2023/9/1 12:37
 * @Version 1.0
 */
@RestController
@RequestMapping("/emp")
@CrossOrigin
public class EmpController {
    @Autowired
    EmpService empService;

    @RequestMapping("/getemp")
    public R getEmpList(@RequestBody GetEmpReq getEmpReq) {
        return empService.getEmpList(getEmpReq);
    }

    @RequestMapping("/getdeptdegree")
    public R getDeptDegree() {
        return empService.getDeptDegree();
    }

    @RequestMapping("/qureyemp")
    public R qureyEmp(@RequestBody QureyEmpReq qureyEmpReq) {
        return empService.qureyEmp(qureyEmpReq);
    }

    @RequestMapping("/addemp")
    public R addEmp(@RequestBody AddReq addReq) {
        return empService.addEmp(addReq);
    }

    @RequestMapping("/updateemp")
    public R updateEmp(@RequestBody AddReq addReq) {
        return empService.updateEmp(addReq);
    }

    @RequestMapping(value = "/deleteemp")
    public R deleteEmp(@RequestBody AddReq addReq) {
//        System.out.println(addReq);
        return empService.deleteEmp(addReq);
    }
}
