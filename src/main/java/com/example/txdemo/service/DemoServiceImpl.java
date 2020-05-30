package com.example.txdemo.service;

import com.example.txdemo.model.DemoAModel;
import com.example.txdemo.model.DemoBModel;
import com.example.txdemo.repository.DemoAModelRepository;
import com.example.txdemo.repository.DemoBModelRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    DemoAModelRepository demoAModelRepository;
    @Autowired
    DemoBModelRepository demoBModelRepository;
    @Autowired
    ObjectMapper objectMapper;
    @Autowired
    DemoBService demoBService;


    @Transactional
    @Override
    public void add() {
        demoBService.add2();
        test1();
//        demoAModelRepository.save(DemoAModel.builder().cc(3).build());
//        if (1 == 1) throw new RuntimeException("自定义异常");
//        demoBModelRepository.save(DemoBModel.builder().cc(3).build());
    }

    @Override
    public Map<String, Object> get() {
        Map<String, Object> map = new HashMap<>();
        map.put("A", demoAModelRepository.findAll());
        map.put("B", demoBModelRepository.findAll());
        return map;
    }

     void test1() {
        demoAModelRepository.save(DemoAModel.builder().cc(1).build());
        if (1 == 1) throw new RuntimeException("自定义异常");
        demoBModelRepository.save(DemoBModel.builder().cc(1).build());
    }
}


