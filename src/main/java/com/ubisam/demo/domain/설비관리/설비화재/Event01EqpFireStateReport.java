package com.ubisam.demo.domain.설비관리.설비화재;

import com.ubisam.demo.domain.ObjectEQP;

import jakarta.persistence.Id;
import lombok.Data;

// 1. EQP 알람 상태 Report
@Data
public class Event01EqpFireStateReport {

    @Id
    private Long timestamp;
    private ObjectEQP ObjectEQP;
    
}
