package com.example.txdemo.repository;

import com.example.txdemo.model.DemoAModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public  interface DemoAModelRepository extends JpaRepository<DemoAModel, Long>, JpaSpecificationExecutor<DemoAModel> {
}
