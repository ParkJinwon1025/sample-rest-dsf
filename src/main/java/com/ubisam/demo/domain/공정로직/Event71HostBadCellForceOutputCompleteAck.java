package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// 셀 강제배출 완료 보고 Confirm
@Data
public class Event71HostBadCellForceOutputCompleteAck {

    @Id
    private Long timestamp;
    private Event70EqpBadCellForceOutputCompleteReport event70;

    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유 
    
}
