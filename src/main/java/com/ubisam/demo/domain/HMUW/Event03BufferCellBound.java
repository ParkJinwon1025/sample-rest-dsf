package com.ubisam.demo.domain.HMUW;

import jakarta.persistence.Id;

// 버퍼에 트레이 넣기
public class Event03BufferCellBound {

    @Id
    private Long timestamp;
    private ObjetBuffer bufferObject;
    private ObjectCell  batteryCell;
    private String action; 

}
