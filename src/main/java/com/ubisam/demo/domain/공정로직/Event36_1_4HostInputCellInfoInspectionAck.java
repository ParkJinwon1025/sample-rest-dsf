package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// 투입셀 정보 검사 요청 Confirm
@Data
public class Event36_1_4HostInputCellInfoInspectionAck {

    @Id
    private Long timestamp;
    private Event36_1_3EqpInputCellInfoInspectionRequest event36_1_3;
    
    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유
    
}
