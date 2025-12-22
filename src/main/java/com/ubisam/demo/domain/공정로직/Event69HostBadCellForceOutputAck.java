package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// 강제배출 셀 처리 요청 Confirm
@Data
public class Event69HostBadCellForceOutputAck {

    @Id
    private Long timestamp;
    private Event68EqpBadCellForceOutputRequest event68;

    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유 
    
}
