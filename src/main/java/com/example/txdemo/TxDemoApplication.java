package com.example.txdemo;

import com.example.txdemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class TxDemoApplication {
    @Autowired
    DemoService demoService;

    public static void main(String[] args) {
        SpringApplication.run(TxDemoApplication.class, args);
    }

    @GetMapping("add")
    public void add() {
        demoService.add();
    }

    @GetMapping("get")
    public Object get() {
        return demoService.get();
    }
}
