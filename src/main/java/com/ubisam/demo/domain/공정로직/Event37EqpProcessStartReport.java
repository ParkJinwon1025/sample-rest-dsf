package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectEQP;

import jakarta.persistence.Id;
import lombok.Data;

// 공정 시작 보고
@Data
public class Event37EqpProcessStartReport {

    @Id
    private Long timestamp;
    private ObjectEQP objectEQP;

}
