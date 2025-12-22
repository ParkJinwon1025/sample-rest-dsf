package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// 56. 배출 Tray 배출 완료 보고
@Data
public class Event56EqpOutletTrayOutputCompleteReport {

    @Id
    private Long timestamp;
    private ObjectTray objectTray;

    private String action; // Complete / Not Complete
}
