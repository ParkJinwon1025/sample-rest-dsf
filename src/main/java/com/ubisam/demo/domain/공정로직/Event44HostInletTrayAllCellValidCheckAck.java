package com.ubisam.demo.domain.공정로직;

import java.util.List;

import com.ubisam.demo.domain.ObjectCell;

import jakarta.persistence.Id;
import lombok.Data;

// 투입 Tray 전체 Cell Valid Check 요청 Confirm
@Data
public class Event44HostInletTrayAllCellValidCheckAck {
    
    @Id
    private Long timestamp;
    private Event43EqpINletTrayAllCellValidCheckRequest event43;
    private List<ObjectCell> cellList;

    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유 
}
