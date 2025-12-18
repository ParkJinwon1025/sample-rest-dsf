package com.ubisam.demo.domain.SmartFarm;

import jakarta.persistence.Id;

public class EventLED제어 {

    @Id
    private Long timestamp;
    private Long value; // LED 제어 값
    private Event조도 event조도; 
    private boolean isManual; //수동 제어 여부
    
}
