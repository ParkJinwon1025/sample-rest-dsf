package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// 33. NG Tray Break 완료 Confirm
@Data
public class Event33HostNGTrayBreakCompleteAck {

    @Id
    private Long timestamp;
    private Event32EqpNGTrayBreakCompleteReport event32;
    
    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유
    
}
