package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// 셀 공정 시작 보고 Confirm
@Data
public class Event36_1_6HostCellProcessStartAck {

    @Id
    private Long timeStamp;
    private Event36_1_5EqpCellProcessStartReport event36_1_5;
    
    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유
    
}
