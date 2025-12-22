package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// 42. 투입 Tray 배출 요청 Confirm
@Data
public class Event42HostInletTrayOutputAck {
    
    @Id
    private Long timestamp;
    private Event41EqpInletTrayOutputRequest event41;
    
    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유 
    
}
