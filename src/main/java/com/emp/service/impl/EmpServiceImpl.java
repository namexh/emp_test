package com.emp.service.impl;

import com.emp.entity.Degree;
import com.emp.entity.Dept;
import com.emp.entity.Emp;
import com.emp.mappers.EmpMapper;
import com.emp.req.AddReq;
import com.emp.req.GetEmpReq;
import com.emp.req.QureyEmpReq;
import com.emp.req.UserReq;
import com.emp.res.R;
import com.emp.service.EmpService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author Yxh
 * @Date 2023/9/1 17:33
 * @Version 1.0
 */
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    EmpMapper empMapper;
    @Override
    public R getEmpList(GetEmpReq getEmpReq) {
        int pageBegin=getEmpReq.getPage();
        int pageSize= getEmpReq.getLimit();
        PageHelper.startPage(pageBegin,pageSize);
        List<Emp> emps= empMapper.getEmpList();
        PageInfo<Emp> list=new PageInfo<>(emps);
        return R.success(list);
    }

    @Override
    public R getDeptDegree() {
        List<Degree> degrees=empMapper.getDegreeList();
        List<Dept> depts=empMapper.getDeptList();
        Map map=new HashMap<>();
        map.put("degrees",degrees);
        map.put("depts",depts);
        return R.success(map);
    }

    @Override
    public R qureyEmp(QureyEmpReq qureyEmpReq) {
         List<Emp> empList=empMapper.queryEmp(qureyEmpReq.getEmpname(), qureyEmpReq.getDeptname(), qureyEmpReq.getDegreename());
        return R.success(empList);
    }

    @Override
    public R addEmp(AddReq addReq) {
//        System.out.println(addReq);
       int flag=empMapper.addEmp(addReq);
       if (flag==1){
           return R.success("ok");
       }
        return R.fail();
    }

    @Override
    public R updateEmp(AddReq addReq) {
        int flag=empMapper.updateEmp(addReq);
        if (flag==1){
            return R.success("ok");
        }
        return R.fail();
    }

    @Override
    public R deleteEmp(AddReq addReq) {
        int id= Integer.parseInt(addReq.getId());
        int flag=empMapper.deleteEmp(id);
        if (flag==1){
            return R.success("ok");
        }
        return R.fail();

    }
}
