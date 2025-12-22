package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// 15. Rack 출고 요청 Confirm
@Data
public class Event15HostRackOutputAck {

    @Id
    private Long timestamp;
    private Event14EqpRackOutputRequest event14;
    
    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유;
    
}
