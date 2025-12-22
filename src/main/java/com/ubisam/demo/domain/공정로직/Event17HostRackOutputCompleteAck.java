package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// 17. Rack 출고 완료 요청 Confirm
@Data
public class Event17HostRackOutputCompleteAck {

    @Id
    private Long timestamp;
    private Event17HostRackOutputCompleteAck event17;

    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유;
    
}
