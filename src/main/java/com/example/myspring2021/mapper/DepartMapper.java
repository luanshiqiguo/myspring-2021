package com.example.myspring2021.mapper;

import com.example.myspring2021.bean.Depart;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DepartMapper {
    @Select({
        "select",
        "id, name, grade", // 数据表表头字段
        "from testMysqlList" // 数据表名
    })
    List<Depart> selectAll();
}