package com.example.txdemo.repository;

import com.example.txdemo.model.DemoBModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public  interface DemoBModelRepository extends JpaRepository<DemoBModel, Long>, JpaSpecificationExecutor<DemoBModel> {
}
