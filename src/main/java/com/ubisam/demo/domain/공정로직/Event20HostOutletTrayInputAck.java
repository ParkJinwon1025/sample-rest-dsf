package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// 20. 배출 Tray 투입 요청 Confirm
@Data
public class Event20HostOutletTrayInputAck {
    
    @Id
    private Long timestamp;
    private Event19EqpOutletTrayInputRequest event19;

    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유;
}
