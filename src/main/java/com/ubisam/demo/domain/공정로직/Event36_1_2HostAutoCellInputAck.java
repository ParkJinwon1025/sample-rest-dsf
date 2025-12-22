package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// 1-2. 자동 투입 - 자동 셀 투입 요청 Confirm
@Data
public class Event36_1_2HostAutoCellInputAck {

    @Id
    private Long timestamp;
    private Event36_1_1EqpAutoCellInputRequest event36_1_1;
    
    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유
    
}
