package com.ubisam.demo.domain.HMUW;

import jakarta.persistence.Id;

// 바코드 읽기
public class Event07BarcodeCellReading {
    
    @Id
    private Long timestamp;
    private ObjectBarcode barcodeObject;
    private ObjectCell  batteryCell;
    private String action; 

}
