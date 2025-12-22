package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// 26. 배출 Tray 투입 완료 요청 Confirm
@Data
public class Event26HostOutletTrayInputCompleteAck {

    @Id
    private Long timestamp;
    private Event26HostOutletTrayInputCompleteAck event26;
    
    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유
    
}
