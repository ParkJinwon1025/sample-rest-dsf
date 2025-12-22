package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// NG Tray 투입 완료 요청 Confirm
@Data
public class Event35HostNGTrayInputCompleteAck {

    @Id
    private Long timestamp;
    private Event34EqpNGTrayInputCompleteReport event34;
    
    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유
    
}
