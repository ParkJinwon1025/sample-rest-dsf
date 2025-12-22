package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// NG Tray 투입 요청 Confirm
@Data
public class Event29HostNGTrayInputAck {

    @Id
    private Long timestamp;
    private Event28EqpNGTrayInputRequest event28;
    
    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유
    
}
