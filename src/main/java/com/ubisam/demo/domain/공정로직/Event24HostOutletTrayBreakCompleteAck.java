package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// 24. 배출 Tray Break 완료 요청 Confirm
@Data
public class Event24HostOutletTrayBreakCompleteAck {

    @Id
    private Long timestamp;
    private Event23EqpOutletTrayBreakCompleteRequest event23;
    
    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유
    
}
