package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// 2. 투입부 Tray 도착 with TrayID
@Data
public class Event02EqpInletTrayArrivalReport {

    @Id
    private Long timestamp;
    private ObjectTray ObjecTray;

    private boolean isArrival; // 도착 여부

}
