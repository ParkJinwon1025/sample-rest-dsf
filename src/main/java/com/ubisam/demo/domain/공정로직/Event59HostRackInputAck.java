package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// 59. Rack 출고 요청 Confirm
@Data
public class Event59HostRackInputAck {

    @Id
    private Long timestamp;
    private Event58EqpRackInputRequest event58;

    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유 
    
}
