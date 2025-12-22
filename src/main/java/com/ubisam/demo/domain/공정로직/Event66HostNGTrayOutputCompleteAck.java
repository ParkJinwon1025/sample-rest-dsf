package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// NG Tray 배출 완료 보고 Confirm
@Data
public class Event66HostNGTrayOutputCompleteAck {

    @Id
    private Long timestamp;
    private Event65EqpNGTrayOutputCompleteReport event65;
    
    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유 
}
