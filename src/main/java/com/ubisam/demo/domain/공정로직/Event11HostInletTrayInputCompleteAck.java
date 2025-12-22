package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// 11. 투입 Tray 투입 완료 요청 Confirm
@Data
public class Event11HostInletTrayInputCompleteAck {

    @Id
    private Long timestamp;
    private Event11HostInletTrayInputCompleteAck event11;

    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유;
    
}
