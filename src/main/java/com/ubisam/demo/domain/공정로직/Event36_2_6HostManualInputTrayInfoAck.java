package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// 2-6. 수동 투입 Tray 정보 확인 Confirm
@Data
public class Event36_2_6HostManualInputTrayInfoAck {

    @Id
    private Long timestamp;
    private Event36_2_6HostManualInputTrayInfoAck event36_2_6;
    
    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유
    
}
