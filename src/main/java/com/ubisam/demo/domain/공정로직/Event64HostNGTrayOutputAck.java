package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// NG Tray 배출 요청 Confirm
@Data
public class Event64HostNGTrayOutputAck {

    @Id
    private Long timestamp;
    private Event63EqpNGTrayOutputRequest event63;
    
    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유 
    
}
