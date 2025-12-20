package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// Tray Break 요청 Confirm
@Data
public class Event22HostTrayBreakConfirm {

    @Id
    private Long timestamp;
    private ObjectTray objectTray;
    private String status; //응답
    
}
