package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectDSF;

import jakarta.persistence.Id;
import lombok.Data;

// 39. 공정 프로세스 완료 보고
@Data
public class Event39EqpProcessEndReport {

    @Id
    private Long timestamp;
    private ObjectDSF objectEQP;

    private String action; // Complete / Not Complete
}
