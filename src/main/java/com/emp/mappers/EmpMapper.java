package com.emp.mappers;

import com.emp.entity.Degree;
import com.emp.entity.Dept;
import com.emp.entity.Emp;
import com.emp.req.AddReq;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author Yxh
 * @Date 2023/9/1 17:56
 * @Version 1.0
 */
@Mapper
public interface EmpMapper {
    List<Emp> getEmpList();
    List<Dept> getDeptList();
    List<Degree> getDegreeList();
    List<Emp> queryEmp(@Param("emp_name") String empname,@Param("dept_name") String deptname,@Param("emp_degree_name") String degreename);
    int addEmp(AddReq addReq);
    int updateEmp(AddReq addReq);
    int deleteEmp(@Param("id") int id);
}
