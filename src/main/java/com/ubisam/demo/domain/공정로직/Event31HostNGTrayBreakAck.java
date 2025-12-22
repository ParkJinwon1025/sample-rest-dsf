package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// NG Tray Break 요청 Confirm
@Data
public class Event31HostNGTrayBreakAck {

    @Id
    private Long timestamp;
    private Event30EqpNGTrayBreakRequest event30;

    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유
    
}
