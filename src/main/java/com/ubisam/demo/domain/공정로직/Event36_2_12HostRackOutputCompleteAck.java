package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// Rack 출고 완료 요청 Confirm
@Data
public class Event36_2_12HostRackOutputCompleteAck {

    @Id
    private Long timestamp;
    private Event36_2_11EqpRackOutputCompleteReport event36_2_11;
    
    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유
    
}
