package com.example.txdemo.service;

import com.example.txdemo.model.DemoAModel;
import com.example.txdemo.repository.DemoAModelRepository;
import com.example.txdemo.repository.DemoBModelRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DemoBServiceImpl implements DemoBService {

    @Autowired
    DemoAModelRepository demoAModelRepository;
    @Autowired
    DemoBModelRepository demoBModelRepository;
    @Autowired
    ObjectMapper objectMapper;


    @Transactional(propagation= Propagation.REQUIRES_NEW)
//    @Transactional
    @Override
    public void add2() {
        demoAModelRepository.save(DemoAModel.builder().cc(2).build());
//        if (1 == 1) throw new RuntimeException("B自定义异常");
//        demoBModelRepository.save(DemoBModel.builder().cc(1).build());
    }
}

