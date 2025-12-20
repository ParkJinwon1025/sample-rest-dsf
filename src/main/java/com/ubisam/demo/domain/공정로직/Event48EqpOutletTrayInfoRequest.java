package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// 배출 Tray 정보 확인 요청 with TrayId
@Data
public class Event48EqpOutletTrayInfoRequest {

    @Id 
    private Long timestamp;
    private ObjectTray objectTray;
    
}
