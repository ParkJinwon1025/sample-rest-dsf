package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectBarcode;
import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// 바코드리더기 CellID Read
@Data
public class Event04BCRCellIDRead {

    @Id
    private Long timestamp;
    private ObjectTray objectTray;
    private ObjectBarcode objectBarcode;
    private String status; // Cell ID Reading 성공 여부
    
    
}
