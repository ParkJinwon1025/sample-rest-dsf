package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// 배출 Tray 투입 요청 with TrayID
@Data
public class Event19EqpOutletTrayInputRequest {

    @Id
    private Long timestamp;
    private ObjectTray objectTray;
    
}
