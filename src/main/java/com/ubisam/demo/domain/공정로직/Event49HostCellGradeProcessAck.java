package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// 49. 셀 등급처리 요청 Confirm
@Data
public class Event49HostCellGradeProcessAck {

    @Id
    private Long timestamp;
    private Event48EqpCellGradeProcessRequest event48;
    private String grade;
    
    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유 
    
}
