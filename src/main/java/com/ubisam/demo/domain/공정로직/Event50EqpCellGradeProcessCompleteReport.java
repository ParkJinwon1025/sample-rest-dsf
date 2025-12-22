package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectCell;

import jakarta.persistence.Id;
import lombok.Data;

// 50. 셀 등급처리 완료 보고
@Data
public class Event50EqpCellGradeProcessCompleteReport {

    @Id
    private Long timestamp;
    private ObjectCell objectCell;

    private String action; // Complete / Not Complete
    
}
