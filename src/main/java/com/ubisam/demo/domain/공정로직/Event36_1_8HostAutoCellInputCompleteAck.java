package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// 자동 셀 투입 완료보고 Confirm
@Data
public class Event36_1_8HostAutoCellInputCompleteAck {

    @Id
    private Long timestamp;
    private Event36_1_7EqpAutoCellInputCompleteReport event36_1_7;
    
    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유
    
}
