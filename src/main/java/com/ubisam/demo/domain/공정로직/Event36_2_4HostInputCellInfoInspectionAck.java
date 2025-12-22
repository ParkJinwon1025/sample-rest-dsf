package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// 2-4. 투입셀 정보 검사 요청 Confirm
@Data
public class Event36_2_4HostInputCellInfoInspectionAck {

    @Id
    private Long timestamp;
    private Event36_2_4HostInputCellInfoInspectionAck event36_2_4;
    
    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유
    
}
