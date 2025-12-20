package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// Tray Break 요청 with TrayId
@Data
public class Event21EqpTrayBreakRequest {

    @Id
    private Long timestamp;
    private ObjectTray objectTray;
    
}
