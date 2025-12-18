package com.ubisam.demo.domain.HMUW;

import jakarta.persistence.Id;

// IROCV에 셀 넣기 
public class Event05IROCVCellBound {
    
    @Id
    private Long timestamp;
    private ObjectIROCV irocvObject;
    private ObjectCell batteryCell;
    private String action;
}
