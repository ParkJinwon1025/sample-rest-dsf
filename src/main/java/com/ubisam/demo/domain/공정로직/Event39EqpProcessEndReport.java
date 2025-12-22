package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectEQP;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Event39EqpProcessEndReport {

    @Id
    private Long timestamp;
    private ObjectEQP objectEQP;

    private String action;
}
