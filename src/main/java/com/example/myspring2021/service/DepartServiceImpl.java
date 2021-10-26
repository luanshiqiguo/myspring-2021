package com.example.myspring2021.service;

import com.example.myspring2021.bean.Depart;
import com.example.myspring2021.mapper.DepartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("departService")
public class DepartServiceImpl implements com.example.myspring2021.service.DepartService {
    @Autowired
    private DepartMapper departMapper;

    @Override
    public List<Depart> selectAll() {
        return departMapper.selectAll();
    }
}