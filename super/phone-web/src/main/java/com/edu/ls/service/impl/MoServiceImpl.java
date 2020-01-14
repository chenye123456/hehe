package com.edu.ls.service.impl;

import com.edu.ls.pojo.Mo;
import com.edu.ls.repository.MoRepository;
import com.edu.ls.service.MoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MoServiceImpl implements MoService {

    @Autowired
    MoRepository moRepository;
    //获取所有的保护贴膜对象，返回一个list集合
    @Override
    public ArrayList<Mo> getAllMo() {

        ArrayList<Mo> list = (ArrayList<Mo>) moRepository.findAll();

        return list;
    }
}
