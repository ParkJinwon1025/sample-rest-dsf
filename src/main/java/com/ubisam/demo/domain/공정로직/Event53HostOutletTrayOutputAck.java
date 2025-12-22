package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

//배출 Tray 배출 요청 Confirm
@Data
public class Event53HostOutletTrayOutputAck {

    @Id
    private Long timestamp;
    private Event52EqpOutletTrayOutputRequest event52;

    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유 
    
}
