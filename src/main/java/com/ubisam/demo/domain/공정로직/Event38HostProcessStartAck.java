package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// 공정 시작 보고 Confirm
@Data
public class Event38HostProcessStartAck {

    @Id
    private Long timestamp;
    private Event37EqpProcessStartReport event37;
    
    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유 

}
