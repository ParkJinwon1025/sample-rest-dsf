package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// NG Tray 투입 완료 요청 Confirm
@Data
public class Event34HostNGTrayInputCompleteConfirm {

    @Id
    private Long timestamp;
    private ObjectTray objectTray;
    private String status;
    
}
