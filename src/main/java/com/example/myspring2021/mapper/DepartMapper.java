package com.example.myspring2021.mapper;

import com.example.myspring2021.bean.Depart;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DepartMapper {
    @Select({
        "select",
        "id, depName, grades",
        "from departments"
    })
    List<Depart> selectAll();
}