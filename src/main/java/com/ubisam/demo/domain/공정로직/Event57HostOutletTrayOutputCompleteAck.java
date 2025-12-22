package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// 57. 배출 Tray 배출 완료 보고 Confirm
@Data
public class Event57HostOutletTrayOutputCompleteAck {
    
    @Id
    private Long timestamp;
    private Event56EqpOutletTrayOutputCompleteReport event56;
    
    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유 
}
