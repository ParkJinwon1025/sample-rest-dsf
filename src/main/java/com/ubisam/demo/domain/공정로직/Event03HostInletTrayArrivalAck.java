package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// 투입부 Tray 도착 Confirm
@Data
public class Event03HostInletTrayArrivalAck {
    
    @Id
    private Long timestamp;
    private Event02EqpInletTrayArrivalReport event02;

    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유;

}
