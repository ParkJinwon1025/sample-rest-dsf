package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// 바코드리더기 TrayID Read Confirm
@Data
public class Event05HostTrayIDReadAck {

    @Id
    private Long timestamp;

    private Event04BCRTrayIDRead event04;
    private String barcode;
    
    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유;
    
}
