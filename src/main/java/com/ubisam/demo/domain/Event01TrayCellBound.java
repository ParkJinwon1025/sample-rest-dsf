package com.ubisam.demo.domain;

import jakarta.persistence.Id;

// 트레이에 셸 넣기
public class Event01TrayCellBound {

    @Id
    private Long timestamp;
    private ObjectTray trayObject;
    private ObjectCell batteryCell;
    private String action; // Cell에 들어가면 In Event / Cell에서 나오면 Out Event
    
}
