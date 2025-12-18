package com.ubisam.demo.domain;

import jakarta.persistence.Id;

// 바코드가 셸 읽기
public class Event04BacodeCellReading {

    @Id
    private Long timestamp;
    private ObjectBarcode barcodeObject;
    private ObjectCell batteryCell;
    private String action; 

}
