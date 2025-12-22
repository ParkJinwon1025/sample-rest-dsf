package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// 배출 Tray 정보 확인 요청 Confirm
@Data
public class Event55HostOutletTrayInfoAck {

    @Id
    private Long timestamp;
    private Event54EqpOutletTrayInfoRequest event54;

    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유 
    
}
