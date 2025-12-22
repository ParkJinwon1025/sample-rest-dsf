package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// 투입 Tray 배출 완료 보고 Confirm
@Data
public class Event46HostInletTrayOutputCompleteAck {

    @Id
    private Long tiemstamp;
    private Event45EqpInletTrayOutputCompleteReport event45;
    
    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유 
    
}
