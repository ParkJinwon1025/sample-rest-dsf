package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// 배출 Tray 배출 완료 보고
@Data
public class Event50EqpOutletTrayOutputCompleteReport {

    @Id
    private Long timestamp;
    private ObjectTray ObjectTray;
    private String status;
    
}
